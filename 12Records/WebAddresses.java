import java.net.URL;
import java.util.Scanner;

class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class WebAddresses
{
	public static void main(String[] args) throws Exception
	{
		URL addys = new URL("https://cs.leanderisd.org/txt/fake-addresses.txt");
		Scanner fin = new Scanner( addys.openStream() );

		Address uno = new Address();
		uno.street = fin.nextLine();
		uno.city   = fin.nextLine();
		uno.state  = fin.next();
		uno.zip    = fin.nextInt();
		fin.skip("\n");

		Address dos = new Address();
		dos.street = fin.nextLine();
		dos.city   = fin.nextLine();
		dos.state  = fin.next();
		dos.zip    = fin.nextInt();
		fin.skip("\n");

		Address tre = new Address();
		tre.street = fin.nextLine();
		tre.city   = fin.nextLine();
		tre.state  = fin.next();
		tre.zip    = fin.nextInt();
		fin.skip("\n");
		
		
		Address kre = new Address();
		kre.street = fin.nextLine();
		kre.city   = fin.nextLine();
		kre.state  = fin.next();
		kre.zip    = fin.nextInt();
		fin.skip("\n");
		
		Address los = new Address();
		los.street = fin.nextLine();
		los.city   = fin.nextLine();
		los.state  = fin.next();
		los.zip    = fin.nextInt();
		fin.skip("\n");
		
		fin.close();
		
		System.out.println(uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
		System.out.println(dos.street + ", " + dos.city + ", " + dos.state + "  " + dos.zip);
		System.out.println(tre.street + ", " + tre.city + ", " + tre.state + "  " + tre.zip);
		System.out.println(kre.street + ", " + kre.city + ", " + kre.state + "  " + kre.zip);
		System.out.println(los.street + ", " + los.city + ", " + los.state + "  " + los.zip);

	}
}