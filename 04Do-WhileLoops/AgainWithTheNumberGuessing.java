import java.util.Scanner;
import java.util.Random;

public class AgainWithTheNumberGuessing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int number = 1 + r.nextInt(10);
		int tries = 0;
		int num = -1;
		int entry;

		System.out.println("I have chosen a number between 1 and 10. Try to guess it." + number);
			/*System.out.print("Your guess: ");
			int entry = keyboard.nextInt(); */
			do {
					System.out.print("Your guess: ");
					entry = keyboard.nextInt();
					tries++;
					num++;
					if(entry != number){
						System.out.println("That is incorrect. Guess again.");
					}
			} while( entry != number );

		System.out.println("That's right! You're a good guesser.");
		System.out.println("It only took you " + tries + " tries.");
	}
}