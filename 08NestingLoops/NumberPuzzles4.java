public class NumberPuzzles4
{
    public static void main( String[] args )
    {

        for ( int a=0; a <= 99; a++ )
        {
            for ( int b=0; b <= 99; b++ )
            {
                for ( int c=0; c <= 99; c++ )
                {
                    for ( int d=0; d <= 99; d++ )
                    {
                        if ((a > 0 && b > 0 && c > 0 && d > 0) && (a + b + c + d == 45) && (a + 2 == b - 2 && a + 2 == c * 2  && a + 2 == d / 2)) {
                            System.out.print( a + " " + b + " " + c + " " + d);
                            System.out.println();
                        }
                    }
                }
            }
        }

        System.out.println("\n");

    }
}