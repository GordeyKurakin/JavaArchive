import java.util.Scanner;

public class DisplayingSomeMultiples
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int choice;
		System.out.print("Choose a number: ");
		choice = keyboard.nextInt();

		System.out.println("");
		for(int y = 1; y <= 12; y++){
			System.out.println(choice + "x" + y + " = " + String.valueOf(choice * y));
		}
	}
}
