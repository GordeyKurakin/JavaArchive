import javax.swing.*;

public class WorstGuessing
{
	public static void main(String[] args)
	{
		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
		String number = JOptionPane.showInputDialog("I'M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");
		int number1 = Integer.parseInt(number);
		int truenumber = 7;
		if(number1 == truenumber){
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + truenumber + "!");
		}
		else{
			System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS " + truenumber + "!");
		}
	}
}