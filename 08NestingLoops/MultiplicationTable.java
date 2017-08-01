public class MultiplicationTable
{
    public static void main( String[] args )
    {

        for ( int a=1; a <= 12; a++ )
        {
            for ( int b=1; b <= 9; b++ )
            {
                System.out.print( a*b + "   ");
            }
            System.out.println();
        }

        System.out.println("\n");

    }
}