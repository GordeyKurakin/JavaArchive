import java.util.Random;
import java.util.Scanner;

public class WhereIsIt
{
    public static void main( String[] args )
    {
    	Scanner keyboard = new Scanner(System.in);
        int[] array;
        int a, b = 0;
    	array = new int[10];
    	Random r = new Random();
    	int red;
    	for(int i = 0; i < array.length; i++ ){
    		red = 1+r.nextInt(50);
    		array[i] = red;
    	}
        System.out.print("Array: ");
        for(int y = 0; y < array.length; y++){
            System.out.print(array[y]+" ");
        }
        System.out.print("\n");
        System.out.print("Value to find: ");
        a = keyboard.nextInt();
        System.out.print("\n");
        for(int i = 0; i < array.length; i++){
            if(a == array[i]){
                System.out.println(a + " is in slot " + i + ".");
                b += 1;
            }
        }
        if(b == 0 ){
            System.out.println(a + " is not in the array.");
        }
    }
}