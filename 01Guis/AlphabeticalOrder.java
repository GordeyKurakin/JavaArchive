import javax.swing.*;

public class AlphabeticalOrder
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What's your last name? ");
		if(name.compareTo("Carswell") < 0){
			System.out.println("You don't have to wait long, " + "'" + name + "'.");
		}
		else if(name.compareTo("Jones") < 0){
			System.out.println("That's not bad, " + "'" + name + "'.");
		}
		else if(name.compareTo("Smith") < 0){
			System.out.println("Looks like a bit of a wait, " + "'" + name + "'.");
		}
		else if(name.compareTo("Young") < 0){
			System.out.println("It's gonna be a while, " + "'" + name + "'.");
		}
		else if(name.compareTo("Young") > 0){
			System.out.println("Not going anywhere for a while? " + "'" + name + "'.");
		}
	}
}