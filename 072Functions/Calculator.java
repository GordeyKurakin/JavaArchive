import java.util.Scanner;

public class Calculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c = 0;
		String op;
		boolean tru = true;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if ( op.equals("+") )
				c = a + b;
			else if ( op.equals("-") )
				c = a - b;
			else if ( op.equals("*") )
				c = a * b;
			else if ( op.equals("/") )
				c = a / b;
			else if ( op.equals("^") )
				c = Math.pow(a, b);
			else if ( a == 0.0)
				break;
			else if ( op.equals("%") )
				c = 10 % 3;
			else if ( op.equals("!")){
				for(int y = 0; a > y; y++){
					a = a * y;
				}
				c = a;
			}
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}

			System.out.println(c);

		} while ( tru );
	}
}
