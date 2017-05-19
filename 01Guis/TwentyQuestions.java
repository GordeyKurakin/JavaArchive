import javax.swing.*;

public class TwentyQuestions
{
	public static void main(String[] args)
	{
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");
		String question1 = JOptionPane.showInputDialog("Question 1) Is it animal, vegetable, or mineral?");
		if(question1.equals("animal")){
			String binar = JOptionPane.showInputDialog("Question 2) Is it bigger than a breadbox?");
			if(binar.equals("yes")){
				System.out.println("My guess is that you are thinking of a mouse.");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			}
			if(binar.equals("no")){
				System.out.println("My guess is that you are thinking of a squirrel.");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			}
		}
		if(question1.equals("vegetable")){
			String binar = JOptionPane.showInputDialog("Question 2) Is it bigger than a breadbox?");
			if(binar.equals("yes")){
				System.out.println("You're thinking of a watermelon!");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			}
			if(binar.equals("no")){
				System.out.println("You're thinking of a carrot!");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			}
		}
		if(question1.equals("mineral")){
			String binar = JOptionPane.showInputDialog("Question 2) Is it bigger than a breadbox?");
			if(binar.equals("yes")){
				System.out.println("My guess is that you are thinking of a camaro.");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			}
			if(binar.equals("no")){
				System.out.println("My guess is that you are thinking of a paper clip.");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			}
		}
	}
}