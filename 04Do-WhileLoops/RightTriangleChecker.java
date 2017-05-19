import java.util.Scanner;
import java.util.Random;

public class RightTriangleChecker
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int number = 1 + r.nextInt(10);
		int tries = 0;
		int entry1;
		int entry2;
		int entry3;
		System.out.println("Enter three integers:");
		System.out.print("Side 1:");
		entry1 = keyboard.nextInt();
		System.out.print("Side 2:");
		entry2 = keyboard.nextInt();
		while(entry2 < entry1){
			System.out.println(entry2 + " is smaller than "+ entry1 +".  Try again.");
			System.out.print("Side 2:");
			entry2 = keyboard.nextInt();
		}
		System.out.print("Side 3:");
		entry3 = keyboard.nextInt();
		while(entry3 < entry2){
			System.out.println(entry3 + " is smaller than "+ entry2 +".  Try again.");
			System.out.print("Side 3:");
			entry3 = keyboard.nextInt();
		}
		System.out.println("Your three sides are "+ entry1+ " " + entry2+ " " +entry3);
		if((Math.pow(entry1, 2) + Math.pow(entry2, 2)) == Math.pow(entry3, 2)){
			System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
		}
		else{
			System.out.println("NO!  These sides do not make a right triangle!");
		}
		
	}
}