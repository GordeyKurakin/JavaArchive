import java.util.Scanner;

public class Keychains1
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
				add_keychains();
				System.out.println();
			}
			if(choice == 2){
				remove_keychains();
				System.out.println();
			}
			if(choice == 3){
				view_order();
				System.out.println();
			}
		}

		System.out.println("");
		checkout();
	}


	public static void add_keychains()  
	{
		System.out.print("ADD KEYCHAINS");
	}
	public static void remove_keychains()
	{
		System.out.print("REMOVE KEYCHAINS");
	}
	public static void view_order()
	{
		System.out.print("VIEW ORDER");
	}
	public static void checkout()
	{
		System.out.print("CHECKOUT");
	}


	
}
