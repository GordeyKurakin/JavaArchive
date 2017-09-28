import java.io.File;
import java.util.Scanner;

public class DisplayingAFile {

  public static void main(String[] args) throws Exception{
    Scanner keyboard = new Scanner(System.in);
    String fil, line;
    System.out.print("Open which file: ");
    fil = keyboard.nextLine();
    File txtfile = new File(fil);
    keyboard.close();
    Scanner readfile = new Scanner(txtfile);
    
    while (readfile.hasNext() )
    {
        line = readfile.nextLine();
        System.out.println( line );
    }
  }
}