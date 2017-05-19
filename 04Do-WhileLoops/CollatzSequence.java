import java.util.Scanner;
import java.util.Random;

public class CollatzSequence
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int number = 1 + r.nextInt(10);
		int tries = 0;
		int entry;
		int biggest = 0;
		int times = 0;
		System.out.print("Starting number: ");
		entry = keyboard.nextInt();
		while(entry != 1){
			while(entry % 2 == 0 && entry != 1){
				entry = entry/2;
				System.out.print(entry + "     ");
				if(biggest < entry){
					biggest = entry;
				}
				times = times + 1;
			}
			while(entry % 2 != 0 && entry != 1){
				entry = entry*3+1;
				System.out.print(entry + "     ");
				if(biggest < entry){
					biggest = entry;
				}
				times = times + 1;
			}
		}
		System.out.println("\n\nTerminated after " + times + " steps.");
		System.out.println("\nBiggest number is " + biggest);
	}
}