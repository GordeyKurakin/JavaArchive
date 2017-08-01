public class NumberPuzzles1
{
    public static void main( String[] args )
    {

        for ( int a=1; a <= 9; a++ )
        {
            for ( int b=0; b <= 9; b++ )
            {
                for ( int c=0; c <= 9; c++ )
                {
                    for ( int d=0; d <= 9; d++ )
                    {
                        if (a*10 + b + c*10 + d == 60 && ((a*10 + b) - (c*10 + d) == 14)) {
                            System.out.print( a + "" + b + " " + c + "" + d);
                            System.out.println();
                        }
                    }
                }
            }
        }

        System.out.println("\n");

    }
}