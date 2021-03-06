import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class Car
{
	String company;
	String model;
	int year;
	String license;
}

public class StoringDataInAFile
{
	public static void main( String[] args ) throws Exception
	{
		Car[] autos = new Car[5];
		Scanner keyboard = new Scanner(System.in);
		for ( int i = 0; i < autos.length; i++ )
		{
			autos[i] = new Car();
			System.out.println( "Car " + (i + 1) );
			System.out.print( "\tMake: " );
			autos[i].company = keyboard.next();
			System.out.print( "\tModel: " );
			autos[i].model = keyboard.next();
			System.out.print( "\tYear: " );
			autos[i].year = keyboard.nextInt();
			System.out.print( "\tLicense: " );	
			autos[i].license = keyboard.next();		
		}
		System.out.print( "To which file do you want to save this information? " );
		String usrFile = keyboard.next();
		PrintWriter fileOut = new PrintWriter( new FileWriter(usrFile) );
		for ( int i = 0; i < autos.length; i++ )
		{
			fileOut.print( autos[i].company + " ");
			fileOut.print( autos[i].model + " " );
			fileOut.print( autos[i].year + " " );
			fileOut.print( autos[i].license + "\n" );
		}
		fileOut.close();
		System.out.println( "Data saved." );
	}
		
}