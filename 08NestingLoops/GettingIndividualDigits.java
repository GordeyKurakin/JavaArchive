public class GettingIndividualDigits
{
    public static void main( String[] args )
    {

        for ( int a=1; a <= 9; a++ )
        {
            for ( int b=0; b <= 9; b++ )
            {
                System.out.print( a + "" + b + ", " + a + "+" + b + " = " + String.valueOf(a + b));
                System.out.println();
            }
        }

        System.out.println("\n");

    }
}