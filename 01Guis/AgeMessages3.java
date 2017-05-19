import javax.swing.*;

public class AgeMessages3
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("Your name: ");
		String input = JOptionPane.showInputDialog("Your age: ");
		int age = Integer.parseInt(input);
		if(age < 16){
			System.out.println("You can't drive, " + name + ".");
		}
		else if(age >= 16 && age <= 17){
			System.out.println("You can't drive, " + name + ".");
		}
		else if(age >= 18 && age <= 24){
			System.out.println("You can drive but not vote, " + name + ".");
		}
		else if(age >= 25){
			System.out.println("You can do pretty much anything, " + name + ".");
		}
	}
}