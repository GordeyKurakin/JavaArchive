import java.io.File;
import java.util.Scanner;

class Person
{
	String name;
	int age;
}

public class GettingMoreDataFromAFile
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		Person[] coolpeople = new Person[5];
		String choice;
		int i = 0;
		System.out.print( "Which file to open: " );
		choice = keyboard.next();
		File usrFile = new File(choice);
		Scanner readFile = new Scanner(usrFile);
		System.out.println( "Reading data from " + choice + "\n" );
		while ( readFile.hasNext() )
		{
			coolpeople[i] = new Person();
			coolpeople[i].name = readFile.next();
			coolpeople[i].age = readFile.nextInt();
			i++;
		}
		readFile.close();
		for ( i = 0; i < coolpeople.length; i++ ){
			System.out.println( coolpeople[i].name + " is " + coolpeople[i].age );
		}
	}
}