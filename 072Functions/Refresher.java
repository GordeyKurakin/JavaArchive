import java.util.Scanner;

public class Refresher
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String choice;
		System.out.print("What is your name: ");
		choice = keyboard.nextLine();

		System.out.println("");
		if(choice.equals("Mitchell")){
			for(int y = 0; y < 5; y++){
				System.out.println("Mitchell");
			}
		}
		else{
			for(int y = 0; y < 10; y++){
				System.out.println(choice);
			}
		}
	}
}
