public class ArmstrongNumbers
{
    public static void main( String[] args )
    {

        for ( int a=1; a <= 9; a++ )
        {
            for ( int b=0; b <= 9; b++ )
            {
                for ( int c=0; c <= 9; c++ )
                {
                    if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == (a*100 + b*10 + c)) {
                        System.out.print( a + "" + b + "" + c );
                        System.out.println();
                    }
                }
            }
        }

        System.out.println("\n");

    }
}