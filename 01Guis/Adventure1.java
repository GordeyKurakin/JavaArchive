import javax.swing.*;

public class Adventure1
{
	public static void main(String[] args)
	{
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		String question1 = JOptionPane.showInputDialog("You are in a creepy house!  Would you like to go 'upstairs' or into the 'kitchen'?");
		if(question1.equals("upstairs")){
			String question2 = JOptionPane.showInputDialog("Upstairs you see a hallway.  At the end of the hallway is the master 'bedroom'.  There is also a 'bathroom' off the hallway.  Where would you like to go?");
			if(question2.equals("bedroom")){
				String question3 = JOptionPane.showInputDialog("You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? ('yes' or 'no')");
				if(question3.equals("yes")){
					System.out.println("Well, then I guess you'll know what was in there.  Thanks for playing, I'm tired of making nested if statements. To be continued(no)");
				}
				if(question3.equals("no")){
					System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing, I'm tired of making nested if statements.");
				}
			}
			if(question2.equals("bathroom")){
				String question4 = JOptionPane.showInputDialog("Inside the bathroom you see bath. Would you like to take a shower some time? ('yes' or 'no')");
				if(question4.equals("yes")){
					System.out.println("You're taking shower it's a good bath, the best bath, 'NeUmestnayaReclama' corp. - our baths the best!");
				}
				if(question4.equals("no")){
					System.out.println("You missed your chance...");
				}
			}
		}
		if(question1.equals("kitchen")){
			String question5 = JOptionPane.showInputDialog("There is a long countertop with dirty dishes everywhere.  Off to one sidethere is, as you'd expect, a refrigerator. You may open the 'refrigerator' or look in a 'cabinet'.");
			if(question5.equals("refrigerator")){
				String question6 = JOptionPane.showInputDialog("Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? ('yes' or 'no')");
				if(question6.equals("yes")){
					System.out.println("You ate some food, at that moment you opened your eyes, it was just a dream.");
				}
				if(question6.equals("no")){
					System.out.println("You die of starvation... eventually.");
				}
			}
			if(question5.equals("cabinet")){
				String question7 = JOptionPane.showInputDialog("Inside the cabinet you see chair and desk. Would you like to sit some time? ('yes' or 'no')");
				if(question7.equals("yes")){
					System.out.println("You sit but you can't stand up, you bored to death.");
				}
				if(question7.equals("no")){
					System.out.println("You're standing...and standing... it's difficult.");
				}
			}
		}
	}
}