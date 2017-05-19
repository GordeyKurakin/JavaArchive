import java.util.Scanner;

public class XsAndYs
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "x      y" );
		System.out.println( "-----------------" );
        for ( double n = -10 ; n <= 10 ; n = n + 0.5)
        {
            System.out.println( n  + "  " + Math.pow(n, 2));
        }

    }
}