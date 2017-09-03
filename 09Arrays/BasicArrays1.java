public class BasicArrays1
{
    public static void main( String[] args )
    {
        int[] array = {-113, -113, -113, -113, -113, -113, -113, -113, -113, -113};
        for(int y = 0; y < array.length; y++){
            System.out.println("Slot " + y + " contains a " + array[y]);
        }
    }
}