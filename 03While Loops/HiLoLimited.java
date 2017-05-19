import java.util.Random;
import javax.swing.*;

public class HiLoLimited
{
	public static void main ( String[] args )
	{
		Random r = new Random();

		int number = 1 + r.nextInt(100);
		System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses. >> " + number);
		// String choise1 = JOptionPane.showInputDialog(number + "First guess: ");
		int choise = -1;
		String choice1;
		int num = 0;
		
		while(choise != number && num < 7){
			choice1 = JOptionPane.showInputDialog(number + " Guess # " + String.valueOf(num+1) + ": ");
			choise = Integer.parseInt(choice1);  
			if(choise > number){
				System.out.println("Sorry, you are too high.");
			}
			else if(choise < number){
				System.out.println("Sorry, you are too low.");
			}
			num++;

		}
		if(choise == number){
			System.out.println("You guessed it!  What are the odds?!?");
		}
		else if(num == 7){
			System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
		}
	}
}