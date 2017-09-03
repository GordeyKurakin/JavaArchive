public class NumberPuzzles1
{
    public static void main( String[] args )
    {

            for ( int a=0; a <= 99; a++ )
            {
                for ( int b=0; b <= 99; b++ )
                {
                    if (a+ b == 60 && (a - b == 14)) {
                        System.out.print( a + " " + b);
                        System.out.println();
                    }
                }
            }

        System.out.println("\n");

    }
}