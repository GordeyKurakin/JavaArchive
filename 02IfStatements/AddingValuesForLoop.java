import java.util.Scanner;

public class AddingValuesForLoop
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print( "Number: " );
        int count = keyboard.nextInt();
		int num = 0;
        for ( int n = 1 ; n <= count ; n = n+1 )
        {
            System.out.print( n + " ");
			num = num + n;
        }
		System.out.println("The sum is " + num + ".");
    }
}