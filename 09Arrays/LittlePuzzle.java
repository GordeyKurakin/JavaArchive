import java.util.Scanner;
import java.io.File;

public class LittlePuzzle
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		String fileIn, lines;
		System.out.print( "Open which file: " );
		fileIn = keyboard.next();
		File file = new File(fileIn);
		Scanner readFile = new Scanner(file);
		lines = readFile.nextLine();
		readFile.close();
		for ( int i = 0; i < lines.length(); i++ )
		{
			if ( (i) % 3 == 0 ){
				System.out.print( lines.charAt(i) );
			}
		}
	}
}