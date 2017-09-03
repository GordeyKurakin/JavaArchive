public class MultiplicationTable
{
    public static void main( String[] args )
    {
        System.out.print( "x | " );
        for ( int b=1; b <= 9; b++ ){
            System.out.print( b + "    ");
        }
        System.out.print("\n");
        System.out.print("==+");
        for ( int b=1; b <= 46; b++ ){
            System.out.print( "=");
        }
        System.out.print("\n");
        
        for ( int a=1; a <= 12; a++ )
        {
            System.out.print(a + " | ");
            for ( int b=1; b <= 9; b++ )
            {
                System.out.print( a*b );
                if(a * b > 9 ){
                    System.out.print("   ");
                }
                else{
                    System.out.print("    ");
                } 
            }
            System.out.println();
        }

        System.out.println("\n");

    }
}