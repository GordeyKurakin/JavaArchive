import java.util.Scanner;

public class BabyNim
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int a = 3;
		int b = 3;
		int c = 3;
		int value;
		int all = a+b+c;;

		String choice;

		while ( all >= 0 )
		{	
				System.out.println( "A: " + a  + "	   " + "B: " + b  + "	   " + "C: " + c);
				System.out.print( "\n" );
				System.out.print("Choose a pile: ");
				choice = keyboard.nextLine();
				System.out.print("How many to remove from pile " + choice + ":");
				value = keyboard.nextInt();
				keyboard.nextLine();
				if(choice.equals("A")){
					a=a-value;
				}
				else if(choice.equals("B")){
					b=b-value;
				}
				else if(choice.equals("C")){
					c=c-value;
				}
				all = a+b+c;
		}

		System.out.println( "\nAll piles are empty. Good job!" );
	}
	
}