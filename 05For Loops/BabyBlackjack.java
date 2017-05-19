import java.util.Random;
import javax.swing.*;

public class BabyBlackjack
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		int number1 = 1 + r.nextInt(10);
		int number2 = 1 + r.nextInt(10);
		int	numberb3 = 1 + r.nextInt(10);
		int	numberb4 = 1 + r.nextInt(10);
		System.out.println("Baby Blackjack!");
		System.out.println("You drew " + number1 + " and " + number2 + ".");
		System.out.println("Your total is " + String.valueOf(number1 + number2) + ".");
		System.out.println("The dealer has " + numberb3 + " and " + numberb4 + ".");
		System.out.println("Dealer's total is " + String.valueOf(numberb3 + numberb4) + "!");
		if(number1 + number2 > numberb3 + numberb4){
			System.out.println("YOU WIN!");
		}
		else{
			System.out.println("YOU LOSE!");
		}
	}
}