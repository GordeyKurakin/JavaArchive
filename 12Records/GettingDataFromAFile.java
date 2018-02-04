import java.io.File;
import java.util.Scanner;

class Dog
{
	String breed;
	int age;
	double weight;
}

public class GettingDataFromAFile
{
	public static void main( String[] args ) throws Exception
	{
		Dog[] dog = new Dog[2];
		String userfile;
		Scanner keyboard = new Scanner(System.in);
		int i = 0;
		
		System.out.print( "Which file to open: " );
		userfile = keyboard.next();
		
		File dogfile = new File(userfile);
		Scanner readfile = new Scanner(dogfile);
		
		System.out.println( "Reading data from " + userfile + "\n" );
		
		while ( readfile.hasNext() )
		{
			dog[i] = new Dog();
			String line = readfile.nextLine();
			String[] detail = line.split(",");
			
			dog[i].breed = detail[0];
			dog[i].age = Integer.parseInt(detail[1]);
			dog[i].weight = Double.parseDouble(detail[2]);
			i++;
		}
		readFile.close();
		
		System.out.println( "First dog: " + dog[0].breed + ", " + dog[0].age + ", " + dog[0].weight );
		System.out.println( "Second dog: " + dog[1].breed + ", " + dog[1].age + ", " + dog[1].weight );
	}
}