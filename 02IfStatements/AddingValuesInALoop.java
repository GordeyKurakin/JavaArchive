import java.util.Random;
import javax.swing.*;

public class  AddingValuesInALoop
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		System.out.println("I will add up the numbers you give me.");
		String number1 = JOptionPane.showInputDialog("Number: ");
		int number = Integer.parseInt(number1);
		int num = 0;
		while(number != 0){
			num = num + number;
			System.out.println("The total so far is " + num);
			number1 = JOptionPane.showInputDialog("Number: ");
			number = Integer.parseInt(number1);
		}
		System.out.println("The total is " + num + ".");
	}
}