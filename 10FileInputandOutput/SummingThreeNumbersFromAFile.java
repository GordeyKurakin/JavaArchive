import java.io.File;
import java.util.Scanner;
public class SummingThreeNumbersFromAFile {
	public static void main(String[] args) throws Exception  {

	    Scanner filein = new Scanner(new File("3nums.txt"));
	    int a = filein.nextInt();
	    int b = filein.nextInt();
	    int c = filein.nextInt();

	    int sum = a + b + c;
	    System.out.println(sum);
	    filein.close();

	}
}