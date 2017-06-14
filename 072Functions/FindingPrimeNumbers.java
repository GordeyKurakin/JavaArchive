public class FindingPrimeNumbers
{
	public static void main( String[] args )
	{
		for(int y = 2; y <= 1000; y++){
			if(isPrime(y)){
				System.out.println(y);
			}
		}
	}


	public static boolean isPrime( int n ) {
		for(int y = 2; y < n; y++){
			if(n % y == 0){
				return false;
			}
		}
		return true;
	}
}
