import java.util.Random;
import javax.swing.*;

public class OneShotHiLo
{
	public static void main ( String[] args )
	{
		Random r = new Random();

		int number = 1 + r.nextInt(100);
		System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
		String choise1 = JOptionPane.showInputDialog(">");
		int choise = Integer.parseInt(choise1);
		if(choise == number){
			System.out.println("You guessed it!  What are the odds?!?");
		}
		else if(choise > number){
			System.out.println("Sorry, you are too high.  I was thinking of " + number + ".");
		}
		else if(choise < number){
			System.out.println("Sorry, you are too low.  I was thinking of " + number + ".");
		}
		
	}
}