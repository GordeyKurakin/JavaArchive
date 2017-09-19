import java.util.Scanner;

public class ParallelArrays
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String[] lastname = { "Cromwell", "Mask", "Snowden", "Tennant", "Capaldi" };
		double[] grade = {66.6, 50.8, 12.3, 10.1, 21.2};
		int[] id = {686888, 809897, 575970, 100000, 140458};
		int choice;

		System.out.print("Values:\n\t");
		for ( int i=0; i<lastname.length; i++ ){
			System.out.print( lastname[i] + " " + grade[i] + " " + id[i] + "\n\t");
		}
		System.out.println();
		System.out.print("ID number to find: ");
		choice = keyboard.nextInt();
		System.out.print("\n");
		for ( int i=0; i<id.length; i++ ){
			if(id[i] == choice){
				System.out.print("Found in slot " + i + "\n\t");
				System.out.print("Name: " + lastname[i] + "\n\t");
				System.out.print("Average: " + grade[i] + "\n\t");
				System.out.print("ID: " + id[i] + "\n\t");
			}
		}
		System.out.println();

	}
}