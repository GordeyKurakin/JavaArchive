import java.util.Scanner;

public class OdometerLoops
{
    public static void main( String[] args ) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which base (2-10): ");
        int a = keyboard.nextInt();
        while(a > 10 || a < 2){
            System.out.println("You can't choose that base. Which base (2-10): ");
            a = keyboard.nextInt();
        }
        for ( int thous=0; thous<a; thous++ )
        //{
            for ( int hund=0; hund<a; hund++ )
            //{
                for ( int tens=0; tens<a; tens++ )
               //{
                    for ( int ones=0; ones<a; ones++ )
                    {
                        System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
                        Thread.sleep(500);
                    }
        /*        }
            }
        }*/

        System.out.println();
    }
}
//Yes it still work
//