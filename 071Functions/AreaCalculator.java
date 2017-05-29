import java.util.Scanner;

//Mistakes:
//Do not repeat yourself! If your program needs to output some text, it should be written just once. 
//You just need to think in what order to put your blocks of code.

public class AreaCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Shape Area Calculator version 0.1 (c) 2005 Mitchell Sample Output, Inc.");
		System.out.println();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("1) Triangle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) Circle");
		System.out.println("5) Quit");
		System.out.print("Which shape: ");
		int choice = keyboard.nextInt();
		System.out.println();
		while(choice != 5){
			if(choice == 1){
				System.out.print("Base: ");
				int base = keyboard.nextInt();
				System.out.print("Height: ");
				int height = keyboard.nextInt();
				System.out.println();
				System.out.println("The area is " + area_triangle(base, height) + ".");
				System.out.println();
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println();
				System.out.println("1) Triangle");
				System.out.println("2) Rectangle");
				System.out.println("3) Square");
				System.out.println("4) Circle");
				System.out.println("5) Quit");
				System.out.print("Which shape: ");
				choice = keyboard.nextInt();
				System.out.println();
			}
			if(choice == 2){
				System.out.print("Length: ");
				int length = keyboard.nextInt();
				System.out.print("Width: ");
				int width = keyboard.nextInt();
				System.out.println();
				System.out.println("The area is " + area_rectangle(length, width) + ".");
				System.out.println();
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println();
				System.out.println("1) Triangle");
				System.out.println("2) Rectangle");
				System.out.println("3) Square");
				System.out.println("4) Circle");
				System.out.println("5) Quit");
				System.out.print("Which shape: ");
				choice = keyboard.nextInt();
				System.out.println();
			}
			if(choice == 3){
				System.out.print("Side length: ");
				int side = keyboard.nextInt();
				System.out.println("The area is " + area_square(side) + ".");
				System.out.println();
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println();
				System.out.println("1) Triangle");
				System.out.println("2) Rectangle");
				System.out.println("3) Square");
				System.out.println("4) Circle");
				System.out.println("5) Quit");
				System.out.print("Which shape: ");
				choice = keyboard.nextInt();
				System.out.println();
			}
			if(choice == 4){
				System.out.print("Raius: ");
				int radius = keyboard.nextInt();
				System.out.println("The area is " + area_circle(radius) + ".");
				System.out.println();
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				System.out.println();
				System.out.println("1) Triangle");
				System.out.println("2) Rectangle");
				System.out.println("3) Square");
				System.out.println("4) Circle");
				System.out.println("5) Quit");
				System.out.print("Which shape: ");
				choice = keyboard.nextInt();
				System.out.println();
			}
		}

		System.out.println("");
		System.out.println("Goodbye.");
	}


	public static double area_circle( int radius )  
	{
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	public static int area_rectangle( int length, int width )
	{
		int area = length * width;
		return area;
	}
	public static int area_square( int side )
	{
		//int area = Math.pow(side, 2);
		int area = side * side;
		return area;
	}
	public static double area_triangle( int base, int height )
	{
		double area = 0.5 * base * height;
		return area;
	}


	
}
