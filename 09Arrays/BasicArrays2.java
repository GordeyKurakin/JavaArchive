import java.util.Random;

public class BasicArrays2
{
    public static void main( String[] args )
    {
    	int[] inters;
    	inters = new int[10];
    	Random r = new Random();
    	int red;
    	for(int i = 0; i < inters.length; i++ ){
    		red = 1 + r.nextInt(100);
    		inters[i] = red;
    	}
        
        for(int y = 0; y < inters.length; y++){
            System.out.println("Slot " + y + " contains a " + inters[y]);
        }
    }
}