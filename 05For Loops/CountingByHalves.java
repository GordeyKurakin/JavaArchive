import java.util.Scanner;

public class CountingByHalves
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "X" );
		System.out.println( "------" );
        for ( double n = -10 ; n <= 10 ; n = n + 0.5)
        {
            System.out.println( n );
        }

    }
}