import java.net.URL;
import java.util.Scanner;

class Address
{
	String street;
	String city;
	String state;
	int zip;

	public String toString()
	{
		return (this.street + ", " + this.city + " " + this.state + "  " + this.zip);
	}
}

public class AddressToString
{
	public static void main(String[] args) throws Exception
	{
		URL addys = new URL("https://cs.leanderisd.org/txt/fake-addresses.txt");

		Address[] addybook = new Address[5];

		Scanner fin = new Scanner( addys.openStream() );

		for ( int i=0; i<5; i++ )
		{
			addybook[i] = new Address();
			addybook[i].street = fin.nextLine();
			addybook[i].city   = fin.nextLine();
			addybook[i].state  = fin.next();
			addybook[i].zip    = fin.nextInt();
			fin.skip("\n");
		}
		fin.close();
		
		for ( int i=0; i<5; i++ )
		{
			System.out.println( (i+1) + ". " + addybook[i] );
		}
	}
}
/*it displays 
1. Address@174b225
2. Address@69b199
3. Address@144fc66
4. Address@18ad742
5. Address@1afa04c
*/
