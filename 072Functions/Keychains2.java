import java.util.Scanner;

public class Keychains2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ye Olde Keychain Shoppe");
		System.out.println();
		int choice = 0;
		int price = 10;
		int numkey = 0;
		while(choice != 4){
			System.out.println();
			System.out.println("Some automatic tests....");
			System.out.println("1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout");
			System.out.print("Please enter your choice: ");
			choice = keyboard.nextInt();
			System.out.println();
			if(choice == 1){
				numkey = add_keychains(numkey);
				System.out.print("You now have " + numkey + " keychains.");
				System.out.println();
			}
			if(choice == 2){
				numkey =  remove_keychains(numkey);
				System.out.print("You now have " + numkey + " keychains.");
				System.out.println();
			}
			if(choice == 3){
				view_order(numkey);
				System.out.println();
			}
		}

		System.out.println("");
		checkout(numkey);
	}


	public static int add_keychains(int numkey)
	{
		Scanner keyboard = new Scanner(System.in);
		int choiceadd;
		System.out.print("You have " + numkey + " keychains. How many to add? ");
		choiceadd = keyboard.nextInt();
		numkey = numkey + choiceadd;
		//System.out.print("You now have " + numkey+ " keychains.");
		return numkey;

	}
	public static int remove_keychains(int numkey)
	{
		Scanner keyboard = new Scanner(System.in);
		int choiceremove;
		System.out.print("You have " + numkey + " keychains. How many to remove? ");
		choiceremove = keyboard.nextInt();
		numkey = numkey - choiceremove;
		//System.out.print("You now have " + numkey + " keychains.");
		return numkey;
	}
	public static void view_order(int numkey)
	{
		System.out.print("You have " + numkey + " keychains.");
		System.out.print("Keychains cost $10 each.");
		System.out.print("Total cost is " + String.valueOf(numkey * 10) + "$.");
	}
	public static void checkout(int numkey)
	{
		Scanner keyboard = new Scanner(System.in);
		String choicen;
		System.out.println("CHECKOUT");
		System.out.println("What is your name? ");
		choicen = keyboard.nextLine();
		System.out.println("Keychains cost $10 each.");
		System.out.println("Total cost is " + String.valueOf(numkey * 10) + "$.");
		System.out.println("Thanks for your order, " + choicen + "!");
	}
}