import java.util.Scanner;

//Mistakes:
//Do not repeat yourself! If your program needs to output some text, it should be written just once. 
//You just need to think in what order to put your blocks of code.

public class Midpoint
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.");
		System.out.println();
		int choice = 0;
		while(choice != 2){
			System.out.println();
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println();
			System.out.println("Some automatic tests....");
			System.out.println("1) Midpoint");
			System.out.println("2) Quit");
			System.out.print("Which variant: ");
			choice = keyboard.nextInt();
			System.out.println();
			if(choice == 1){
				System.out.print("x1: ");
				int x1 = keyboard.nextInt();
				System.out.print("y1: ");
				int y1 = keyboard.nextInt();
				System.out.print("x2: ");
				int x1 = keyboard.nextInt();
				System.out.print("y2: ");
				int x1 = keyboard.nextInt();
				System.out.println();
				System.out.println("The area is " + midpoint1(x1, x2) + "; " + midpoint2(y1, y2) + ".");
			}
			
		}

		System.out.println("");
		System.out.println("Goodbye.");
	}


	public static double midpoint1( double x1, double x2 )  
	{
		double area = x1 + (x1 - x2)/2;
		return area;
	}
	public static double midpoint2( double y1, double y2 )  
	{
		double area = y1 + (y1 - y2)/2;
		return area;
	}
}
