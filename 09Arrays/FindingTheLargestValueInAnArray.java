import java.util.Random;
import java.util.Scanner;

public class FindingTheLargestValueInAnArray
{
    public static void main( String[] args )
    {
    	Scanner keyboard = new Scanner(System.in);
        int[] array;
        int a=0;
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
        System.out.print("\n");
        for(int i = 0; i < array.length; i++){
            if(a < array[i]){
                a = array[i];
            }
        }
        
        System.out.print("The largest value is " + a);
    }
}