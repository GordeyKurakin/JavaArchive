public class GivingAnArrayABunchOfValuesAtOnce
{
	public static void main( String[] args )
	{
		String[] arr1 = { "alpha", "bravo", "charlie", "song", "free" };
		int[] arr2 = {4675476, 80989, 9658, 598789, 86549578};

		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i=0; i<arr1.length; i++ )
			System.out.print( arr1[i] + " " );
		System.out.println();
		System.out.print("The second array is filled with the following values:\n\t");
		for ( int i=0; i<arr2.length; i++ )
			System.out.print( arr2[i] + " " );
		System.out.println();

	}
}