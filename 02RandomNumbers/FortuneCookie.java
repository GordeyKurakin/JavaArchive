import java.util.Random;

public class FortuneCookie
{
	public static void main ( String[] args )
	{
		Random r = new Random();

		int variant = 1 + r.nextInt(6);
		String response = "";

		if ( variant == 1 )
			response = "You will be happy!";
		else if ( variant == 2 )
			response = "You will be sad!";
		else if ( variant == 3 )
			response = "You will read fortune!";
		else if ( variant == 4 )
			response = "You will be happy!";
		else if ( variant == 5 )
			response = "You will explore Mars!";
		else if ( variant == 6 )
			response = "It will be good day!";

		System.out.println( "Fortune cookie says: " + response );

		System.out.print( 1 + r.nextInt(54) + " - " );
		System.out.print( 1 + r.nextInt(54) + " - " );
		System.out.print( 1 + r.nextInt(54) + " - " );
		System.out.print( 1 + r.nextInt(54) + " - " );
		System.out.print( 1 + r.nextInt(54) + " - " );
		System.out.print( 1 + r.nextInt(54) + " " );
	}
}