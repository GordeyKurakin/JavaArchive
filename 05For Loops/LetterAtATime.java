import java.util.Scanner;

public class LetterAtATime
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

		for ( int i=0; i<message.length(); i++ )
		{
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int a_count = 0;
		int A_count = 0;
		int e_count = 0;
		int E_count = 0;
		int i_count = 0;
		int I_count = 0;
		int o_count = 0;
		int O_count = 0;
		int u_count = 0;
		int U_count = 0;

		for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' )
			{
				a_count++;
			}
			if ( letter == 'A' )
			{
				A_count++;
			}
			if ( letter == 'e' )
			{
				e_count++;
			}
			if ( letter == 'E' )
			{
				E_count++;
			}
			if ( letter == 'i' )
			{
				i_count++;
			}
			if ( letter == 'I' )
			{
				I_count++;
			}
			if ( letter == 'o' )
			{
				o_count++;
			}
			if ( letter == 'O' )
			{
				O_count++;
			}
			if ( letter == 'u' )
			{
				u_count++;
			}
			if ( letter == 'U' )
			{
				U_count++;
			}
		}
		int County = a_count + A_count + e_count + E_count + i_count + I_count + o_count + O_count + u_count + U_count;
		System.out.println("\nYour message contains the letter 'a A e E i I o O u U' " + County + " times. Isn't that interesting?");
		/*System.out.println("\nYour message contains the letter 'A' " + A_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'e' " + e_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'E' " + E_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'i' " + i_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'I' " + I_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'o' " + o_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'O' " + O_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'u' " + u_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'U' " + U_count + " times. Isn't that interesting?");*/
		//start value of i is 0 and final number not go
	}
}
