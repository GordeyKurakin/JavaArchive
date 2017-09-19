import java.io.File;
import java.util.Scanner;

public class SummingSeveralNumbersFromAnyFile
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		String file;
		int num, total = 0;
		System.out.print( "Which file would you like to read numbers from: " );
		file = keyboard.next();
		File filed = new File(file);
		Scanner readfile = new Scanner(filed);
		System.out.println( "Reading numbers from '" + file + "'\n" );
		while ( readfile.hasNext() )
		{
			num = readfile.nextInt();
			total += num;
			System.out.print( num + " " );
		}
		readfile.close();
		System.out.println( "\nTotal is " + total );
	}
}