import java.util.Scanner;

public class NumberPuzzles2
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int choice = 0;
        while(choice != 3){
            System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
            System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
            System.out.println("3) Quit");
            System.out.print("> ");
            choice = keyboard.nextInt();
            if(choice == 1){
                for ( int a=0; a <= 9; a++ )
                {
                    for ( int b=0; b <= 9; b++ )
                    {
                        if(a + b > 10 && (a*10+b) <= 56){
                            System.out.print( a + "" + b + ", " + a + "+" + b + " = " + String.valueOf(a + b));
                            System.out.println();
                        }
                    }
                }
            }
            else if(choice == 2){
                for ( int a=1; a <= 9; a++ )
                {
                    for ( int b=0; b <= 9; b++ )
                    {
                        if((a * 10 + b) - (b * 10 + a) == a + b){
                            System.out.print(String.valueOf(a * 10 + b) + "-" + String.valueOf(b * 10 + a) + " = " + String.valueOf((a * 10 + b) - (b * 10 + a)));
                            System.out.println();
                        }
                    }
                }
            }
        }

        System.out.println("\n");

    }
}