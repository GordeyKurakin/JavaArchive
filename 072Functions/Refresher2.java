import java.util.Scanner;

public class Refresher2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String choice;
		System.out.print("What is your name: ");
		choice = keyboard.nextLine();

		System.out.println("");
		for(int y = 0; y < 5; y++){
			if(!choice.equals("Mitcell")){
				System.out.println(choice);
				System.out.println(choice);
				System.out.println(choice);
				System.out.println(choice);
				System.out.println(choice);
				System.out.println(choice);
				System.out.println(choice);
				System.out.println(choice);
				System.out.println(choice);
				System.out.println(choice);
				break;
			}
			System.out.println("Mitcell");
		}
	}
}
