import java.io.File;
import java.util.Scanner;
public class SummingSeveralNumbersFromAnyFile {
	public static void main(String[] args) throws Exception  {
		Scanner keyboard = new Scanner(System.in);
		String file;


		System.out.print("Which file would you like to read numbers from: ");
		file = keyboard.nextLine();
		System.out.println("Reading numbers from file '" + file + "'\n");
	    Scanner filein = new Scanner(new File(file));
	    int a = filein.nextInt();
	    int b = filein.nextInt();
	    int c = filein.nextInt();

	    int sum = a + b + c;
	    System.out.println(a + " + " + b + " + " + c + " = " + sum);
	    filein.close();

	}
}