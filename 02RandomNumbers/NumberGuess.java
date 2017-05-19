import java.util.Random;
import javax.swing.*;

public class NumberGuess
{
	public static void main ( String[] args )
	{
		Random r = new Random();

		int number = 1 + r.nextInt(10);
		System.out.println("I'm thinking of a number from 1 to 10.");
		String choise1 = JOptionPane.showInputDialog("Your guess: ");
		int choise = Integer.parseInt(choise1);
		if(choise == number){
			System.out.println("That's right!  My secret number was " + number + "!");
		}
		else{
			System.out.println("Sorry, but I was really thinking of " + number + ".");
		}
		
	}
}