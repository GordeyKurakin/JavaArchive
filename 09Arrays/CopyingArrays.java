import java.util.Random;

public class CopyingArrays
{
    public static void main( String[] args )
    {
    	int[] aray, array;
    	aray = new int[10];
    	array = new int[10];
    	Random r = new Random();
    	int red;
    	for(int i = 0; i < aray.length; i++ ){
    		red = 1+r.nextInt(100);
    		aray[i] = red;
    	}
    	for(int i=0; i<array.length; i++){
   			array[i]=aray[i];
		}
		aray[9]=-7;
        System.out.print("Array 1: ");
        for(int y = 0; y < aray.length; y++){
            System.out.print(aray[y]+" ");
        }
        System.out.print("\n");
        System.out.print("Array 2: ");
        for(int y = 0; y < array.length; y++){
            System.out.print(array[y]+" ");
        }
    }
}