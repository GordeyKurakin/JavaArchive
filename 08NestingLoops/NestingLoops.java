public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for (int n=1; n <= 3; n++ )
        {
            for (char c='A'; c <= 'E'; c++ )
            {
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            // * You will add a line of code here.
            System.out.println();
        }

        System.out.println("\n");

    }
}
//Variable n changes faster
//Now here is in the first column (A B C D E)x3 except Ax3 Bx3 Cx3 Dx3 Ex3 and in the second column 1x5 2x5 3x5 except (1 2 3)x5
//Now it prints in the column
//Now it ends lines after 3 pairs.