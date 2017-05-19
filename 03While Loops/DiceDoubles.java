import java.util.Random;
import javax.swing.*;

public class DiceDoubles
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		int number1 = 1 + r.nextInt(6);
		int number2 = 1 + r.nextInt(6);
		System.out.println("HERE COMES THE DICE!");
		while(number1 != number2){
			number1 = 1 + r.nextInt(6);
			number2 = 1 + r.nextInt(6);
			System.out.println("Roll #1: " + number1);
			System.out.println("Roll #2: " + number2);
			System.out.println("The total is " + String.valueOf(number1 + number2) + "!");
		}
	}
}