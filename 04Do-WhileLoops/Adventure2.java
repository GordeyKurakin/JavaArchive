import java.util.Scanner;

public class Adventure2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int nextroom = 1;
		String choice = "";

		while ( nextroom != 0 )
		{
			if ( nextroom == 1 )
			{
				System.out.println( "You are on a small street. There is a \"left\" way and \"right\" way." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("left") )
					nextroom = 2;
				else if ( choice.equals("right") )
					nextroom = 3;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 2 )
			{
				System.out.println( "You're before a big wall. There's nothing to do here except go \"back\"." );
				System.out.print( "> " );
				choice = keyboard.nextLine();
				if ( choice.equals("back") )
					nextroom = 1;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 3 )
			{
				System.out.println( "You find yourself before big old house. Oddly, there is only a single" );
				System.out.println( "\"door\" visible." );
				System.out.println( "And there is barn." );
				System.out.println( "And there is man, with orange shirt." );
				System.out.println( "Do you want to enter the \"door\" or go to \"man\" or enter the \"barn\" looking for clues?" );
				choice = keyboard.nextLine();
				System.out.print( "> " );
				if ( choice.equals("door") )
					nextroom = 1;
				else if ( choice.equals("barn") )
					nextroom = 4;
				else if ( choice.equals("man") )
					nextroom = 5;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 4 )
			{
				System.out.println( "You entered to the barn. It bigger inside than outside" );
				System.out.println( "You hear voise, he asked:" );
				System.out.println( "\"What are you doing in my TARDIS\"" );
				System.out.println();
				nextroom = 0;
			}
			if ( nextroom == 5 )
			{
				System.out.println( "You hear:" );
				System.out.println( "\"Here is only one life form, hey, guy, do you wanna \"travel\" in space?" );
				System.out.println( "Or you can go \"back\"." );
				choice = keyboard.nextLine();
				System.out.print( "> " );				
				if ( choice.equals("travel") )
					nextroom = 6;
				else if ( choice.equals("back") )
					nextroom = 1;
				else
					System.out.println( choice + " wasn't one of the options. Try again." );
			}
			if ( nextroom == 6 )
			{
				System.out.println( "You hear:" );
				System.out.println( "Bring us up Scotty!" );
				System.out.print( "You are in space ship, wonderful adventures are waiting you." );				
				nextroom = 0;
			}
				
		}

		System.out.println( "\nThe game is over. The next episode can be downloaded for only 800 Microsoft points!" );
	}
	
}