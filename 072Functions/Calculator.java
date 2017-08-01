import java.util.Scanner;
import java.lang.Math;

public class Calculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a = 2, b = 0, c = 0, a1, s = 0;
		String op;
		boolean tru = true;

		do
		{
			System.out.print("> ");
			if(a != c) {
				a  = keyboard.nextDouble();
			}
			else{
				System.out.print(c);///////
			}
			op = keyboard.next();
			if(op.equals("!") || op.equals("sin") || op.equals("cos") || op.equals("tan") || op.equals("sqrt") || op.equals("dcos") || op.equals("dsin") || op.equals("dtan") || op.equals("bin") || op.equals("help") || op.equals("round")  || op.equals("store")  || op.equals("recall")){

			}
			else{
				b  = keyboard.nextDouble();
			}

			if ( a == 0.0 )
				tru = false;
			else if ( op.equals("+") )
				c = a + b;
			else if ( op.equals("-") )
				c = a - b;
			else if ( op.equals("*") )
				c = a * b;
			else if ( op.equals("/") )
				c = a / b;
			else if ( op.equals("^") )
				c = Math.pow(a, b);
			else if ( op.equals("%") )
				c = a % b;
			else if ( op.equals("!")){
				a1 = a;
				for(int y = 1; y < a1; y++){
					a = a * y;
				}
				c = a;
			}
			else if ( op.equals("sin")){
				c = Math.sin(a);
			}
			else if ( op.equals("round")){
				c = Math.round(a);
			}
			else if ( op.equals("help")){
				a1 = 0;
			}
			else if ( op.equals("dsin")){
				c = Math.sin(a*0.0174533);
			}
			else if ( op.equals("cos")){
				c = Math.cos(a);
			}
			else if ( op.equals("dcos")){
				c = Math.cos(a*0.0174533);
			}
			else if ( op.equals("tan")){
				c = Math.tan(a);
			}
			else if ( op.equals("dtan")){
				c = Math.tan(a*0.0174533);
			}
			else if ( op.equals("sqrt")){
				c = Math.sqrt(a);
			}
			else if ( op.equals("root")){
				while(a < 0){
					System.out.println("You can't find root from negative number, enter positive or 0: ");
					a = keyboard.nextDouble();
				}
				c = Math.pow(a, 1/b);
			}
			else if ( op.equals("log")){
				c = Math.log(a) / Math.log(b);
			}
			else if ( op.equals("store")){
				s = c;
			}
			else if ( op.equals("recall")){
				c = s;
			}
			else if ( op.equals("bin")){
				c = a;
			}
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}
			if (a == 0.0) {
				
			}
			else{
				if( op.equals("bin")){
					Integer i = (int) c;
					System.out.println(Integer.toBinaryString(i));
					System.out.println("Double was round down.");
				}
				else if( op.equals("help")){
					System.out.println("My Calculator can do");

					System.out.println("Addition '+'");
					System.out.println("Subtraction '-'");
					System.out.println("Multiplication '*'");
					System.out.println("Division '/'");
					System.out.println("Exponents '^'");
					System.out.println("Modulus '%'");
					System.out.println("Factorials '!'");
					System.out.println("Sinus, Cosinus, Tangens (sin, cos, tan) just and for degrees (dsin, dcos, dtan)");
					System.out.println("Logarithms 'log'");
					System.out.println("Arbitary roots 'root'");
					System.out.println("Conversion to binary 'bin'");
					System.out.println("Rounding 'round'");
				}
				else{
					System.out.println(c);
				}
			}
			a = c;
		} while ( tru );
	}
}
//714112
//691814
//582303
//475468
//513064
//648906
//656613
//676349
//678064
//686311
//695256