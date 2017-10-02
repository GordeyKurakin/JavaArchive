import java.util.Scanner;

public class Hangman
{
	public static void main( String[] args )
	{
		String[] words = { "lie", "true", "reason", "life", "tomato", "cats" };
		String rword;
		char[] lines;
		Scanner keyboard = new Scanner(System.in);
		String guess;
		int misss = 0;
		char[] missed = new char[6];
		boolean found = false, solved = false;
		rword = words[ (int)(Math.random() * words.length) ];
		lines = new char[rword.length()];
		for ( int i = 0; i < rword.length(); i++ )
		{
			lines[i] = '_';
		}		
		while (misss < 5 && ! solved)
		{
			System.out.println( "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" );
			System.out.println( "You have " + (5 - misss) + " tries." );
			System.out.print( "Word:\t" );
			for ( int i = 0; i < rword.length(); i++ ) {
				System.out.print( lines[i] + " " );
			}
			System.out.print("\nMisses: ");
			for ( int i = 0; i < missed.length; i++ ) {
				System.out.print( missed[i] );
			}
			System.out.println( "\nIf you will write more than one simbol, first will be guess, others will be cut." );
			System.out.print( "\nGuess: " );
			guess = keyboard.next();
			found = false;
			
			for ( int i = 0; i < rword.length(); i++ ) {
				if ( guess.charAt(0) == rword.charAt(i) ) {
					lines[i] = rword.charAt(i);
					found = true;
				}
			}
			if (!found) {
				misss++;
				missed[misss] = guess.charAt(0);	
			}
			
			int mistery = 0;
			for ( int i = 0; i < rword.length(); i++ ) {
				if ( '_' == lines[i] ){
					mistery++;
				}
			}
			if (mistery > 0){
				solved = false;
			}
			else{
				solved = true;
			}
		}
		if (solved){
			System.out.println( "\nYou did it!" );
		}
		else{
			System.out.println( "\n\nThe word was: " + rword );	
		}
	}
}