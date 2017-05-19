import java.util.Scanner;

public class CountingMachineRevisited
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print( "Count from: " );
        int countf = keyboard.nextInt();
		System.out.print( "Count to  : " );
        int countt = keyboard.nextInt();
		System.out.print( "Count by  : " );
        int countb = keyboard.nextInt();

        for ( int n = countf ; n <= countt ; n = n + countb)
        {
            System.out.print( n + " ");
        }

    }
}