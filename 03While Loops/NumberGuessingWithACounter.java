import java.util.Scanner;
import java.util.Random;

public class NumberGuessingWithACounter
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int number = 1 + r.nextInt(10);
		int tries = 0;

		System.out.println("I have chosen a number between 1 and 10. Try to guess it. " + number);
		int entry = 0;

		while ( entry != number )
		{
			System.out.print("Your guess: ");
			entry = keyboard.nextInt();
			if( entry != number ){
				System.out.println("That is incorrect. Guess again.");
				tries++;
			}
		}

		System.out.println("That's right! You're a good guesser.");
		System.out.println("It only took you " + String.valueOf(1 + tries) + " tries.");
	}
}