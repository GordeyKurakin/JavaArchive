import java.util.Random;
import java.util.Scanner;

public class IsItThereOrNot
{
    public static void main( String[] args )
    {
    	Scanner keyboard = new Scanner(System.in);
        int[] array;
        int a;
        boolean truth = false;
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
                truth = true;
            }
        }
        if(truth){
            System.out.print(a + " is in the array.");
        }
        else{
            System.out.print(a + " is not in the array.");
        }
    }
}