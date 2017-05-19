import java.util.Random;
import javax.swing.*;

public class ThreeCardMonte
{
	public static void main ( String[] args )
	{
		Random r = new Random();

		int number = 1 + r.nextInt(3);
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.");
		System.out.println("Which one is the ace?");
		System.out.println("       ##  ##  ##");
		System.out.println("       ##  ##  ##");
		System.out.println("       1   2   3 ");
		String choise1 = JOptionPane.showInputDialog(">");
		int choise = Integer.parseInt(choise1);
		if(choise == number){	
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
			}
		if(choise != number){
			System.out.println("Ha! Fast Eddie wins again! The ace was card number "+ number + ".");
		}
		if(number == 1){
			System.out.println("       AA  ##  ##");
			System.out.println("       AA  ##  ##");
			System.out.println("       1   2   3 ");			
		}
		else if(number == 2){
			System.out.println("       ##  AA  ##");
			System.out.println("       ##  AA  ##");
			System.out.println("       1   2   3 ");
		}
		else if(number == 3){
			System.out.println("       ##  ##  AA");
			System.out.println("       ##  ##  AA");
			System.out.println("       1   2   3 ");
		}
		/*else if(choise != number){
			System.out.println("Ha! Fast Eddie wins again! The ace was card number "+ number + ".");
			if(number == 1){
				System.out.println("       AA  ##  ##");
				System.out.println("       AA  ##  ##");
				System.out.println("       1   2   3 ");
			}
			else if(number == 2){
				System.out.println("       ##  AA  ##");
				System.out.println("       ##  AA  ##");
				System.out.println("       1   2   3 ");
			}
			else if(number == 3){
				System.out.println("       ##  ##  AA");
				System.out.println("       ##  ##  AA");
				System.out.println("       1   2   3 ");
			}
		}*/
		
	}
}