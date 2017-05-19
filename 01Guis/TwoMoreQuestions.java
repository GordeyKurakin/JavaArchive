import javax.swing.*;

public class TwoMoreQuestions
{
	public static void main(String[] args)
	{
		System.out.println("TWO MORE QUESTIONS, BABY!");
		System.out.println("Think of something and I'll try to guess it!");
		String question1 = JOptionPane.showInputDialog("Question 1: Does it belong inside or outside or both? ");
		String binar = JOptionPane.showInputDialog("Is it a living thing? ");
		if(binar.equals("yes") && question1.equals("inside")){
			System.out.println("Then what else could you be thinking of besides a houseplants?!?");
		}
		if(binar.equals("no") && question1.equals("inside")){
			System.out.println("Then what else could you be thinking of besides a shower curtain?!?");
		}
		if(binar.equals("yes") && question1.equals("outside")){
			System.out.println("Then what else could you be thinking of besides a beson?!?");
		}
		if(binar.equals("no") && question1.equals("outside")){
			System.out.println("Then what else could you be thinking of besides a billboard?!?");
		}
		if(binar.equals("yes") && question1.equals("both")){
			System.out.println("Then what else could you be thinking of besides a dog?!?");
		}
		if(binar.equals("no") && question1.equals("both")){
			System.out.println("Then what else could you be thinking of besides a cell phone?!?");
		}
	}
}