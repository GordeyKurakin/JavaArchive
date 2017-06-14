import java.util.Scanner;

public class Keychains3
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ye Olde Keychain Shoppe");
		System.out.println();
		int choice = 0;
		Double price = 10.0;
		int numkey = 0;
		Double tax = 0.0825;
		int base_shipping = 5;
		int per_keychain_shipping = 1;


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
			else if(choice == 2){
				numkey =  remove_keychains(numkey);
				System.out.print("You now have " + numkey + " keychains.");
				System.out.println();
			}
			else if(choice == 3){
				view_order(numkey, price, tax, base_shipping, per_keychain_shipping);
				System.out.println();
			}
			else {
				System.out.println("You enterd a wrong option.");
			}
		}

		System.out.println("");
		checkout(numkey, price, tax, base_shipping, per_keychain_shipping);
	}


	public static int add_keychains(int numkey)
	{
		Scanner keyboard = new Scanner(System.in);
		int choiceadd;
		System.out.print("You have " + numkey + " keychains. How many to add? ");
		choiceadd = keyboard.nextInt();
		while(choiceadd < 0){
			System.out.print("You can't add least than 0. Try again: ");
			choiceadd = keyboard.nextInt();
		}
		numkey = numkey + choiceadd;
		return numkey;

	}
	public static int remove_keychains(int numkey)
	{
		Scanner keyboard = new Scanner(System.in);
		int choiceremove;
		System.out.print("You have " + numkey + " keychains. How many to remove? ");
		choiceremove = keyboard.nextInt();
		while(choiceremove < 0 || choiceremove > numkey){
			System.out.print("You can't do that. Try again: ");
			choiceremove = keyboard.nextInt();
		}
		numkey = numkey - choiceremove;
		return numkey;
	}
	public static void view_order( int num_keychains, double price_per_keychain, double tax, int base_shipping, int per_keychain_shipping )
	{
		System.out.println("You have " + num_keychains + " keychains.");
		System.out.println("Keychains cost $10 each.");
		System.out.println("Base shipping cost $5.");
		System.out.println("Price per keychain shipping cost $1.");
		System.out.println("Total cost is " + String.valueOf(num_keychains * price_per_keychain + num_keychains*per_keychain_shipping + base_shipping) + "$. Without tax.");
		System.out.println("Total cost is " + String.valueOf(num_keychains * price_per_keychain + num_keychains*per_keychain_shipping + base_shipping + (num_keychains * price_per_keychain + num_keychains*per_keychain_shipping + base_shipping) * tax) + "$.");
	}
	public static void checkout( int num_keychains, double price_per_keychain, double tax, int base_shipping, int per_keychain_shipping )
	{
		Scanner keyboard = new Scanner(System.in);
		String choicen;
		System.out.println("CHECKOUT");
		System.out.println("What is your name? ");
		choicen = keyboard.nextLine();
		view_order(num_keychains, price_per_keychain, tax , base_shipping, per_keychain_shipping);
		System.out.println("Thanks for your order, " + choicen + "!");
	}
}