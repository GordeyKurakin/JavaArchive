import java.util.Scanner;
import java.io.File;

public class VowelCapitalization
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		String fileIn;
		File file;
		System.out.print( "Open which file: " );
		fileIn = keyboard.next();
		file = new File(fileIn);
		Scanner readfile = new Scanner(file);
		while ( readfile.hasNext() ){
			String lines = readfile.nextLine();
			for ( int i = 0; i < lines.length(); i++ )
			{
				char ch = lines.charAt(i);
				if ( ch == 'a' || ch == 'e' || ch == 'i' ||  ch == 'o' || ch == 'u'){
					System.out.print( Character.toUpperCase(ch) );
				}
				else{
					System.out.print( lines.charAt(i) );
				}
			}
			System.out.println();
		}
	}
}