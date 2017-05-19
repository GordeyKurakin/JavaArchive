import javax.swing.*;

public class GenderGame
{
	public static void main(String[] args)
	{
		String question1 = JOptionPane.showInputDialog("What is your gender (M or F): ");
		String question2 = JOptionPane.showInputDialog("First name: ");
		String question3 = JOptionPane.showInputDialog("Last name: ");
		String question4 = JOptionPane.showInputDialog("Age: ");
		int age = Integer.parseInt(question4);
		if(question1.equals("M"))
			if(age >= 20)
				System.out.println("Then I shall call you Mr. " + question3 + ".");
			else
				System.out.println("Then I shall call you " + question2 + " " + question3 + ".");
		if(question1.equals("F"))
			if(age < 20){
				System.out.println("Then I shall call you " + question2 + " " + question3 + ".");
			}
			else if(age >= 20){
				String question5 = JOptionPane.showInputDialog("Are you married, " + question2 + " (y or n)? ");
				if(age >= 20 && question5.equals("y"))
					System.out.println("Then I shall call you Mrs. " + question3 + ".");
				if(age >= 20 && question5.equals("n"))
					System.out.println("Then I shall call you Ms. " + question3 + ".");
			}
			
	}
}