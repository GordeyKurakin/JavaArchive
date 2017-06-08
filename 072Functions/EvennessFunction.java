public class EvennessFunction
{
	public static void main( String[] args )
	{
		for(int y = 1; y <= 20; y++){
			System.out.print(y + " ");
			if(isEven(y)){
				System.out.print("<");
			}
			if(isDivisibleBy3(y)){
				System.out.print("=");
			}
			System.out.print("\n");
		}
	}


	public static boolean isEven( int n ) 
	{
		if(n % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isDivisibleBy3( int n )
	{
		if(n % 3 == 0){
			return true;
		}
		else{
			return false;
		}
	}
}
