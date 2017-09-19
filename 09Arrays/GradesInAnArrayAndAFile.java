import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class GradesInAnArrayAndAFile {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    // Convert the string to a
    // byte array.
    String n, f;
    int a;
    int [] array = new int[5];
    int red;
    for(int i = 0; i < array.length; i++ ){
      red = 1+r.nextInt(100);
      array[i] = red;
    }

    System.out.print("Name (first last): ");
    n = keyboard.nextLine();
    System.out.print("Filename: ");
    f = keyboard.nextLine();
    System.out.print("\n");
    System.out.print("Here are your randomly-selected grades (hope you pass):\n");
    for(int y = 0; y < array.length; y++){
      System.out.println("Grade " + y + ": " + array[y]+" ");
    }
    System.out.print("\n");
    String s = n + "\n" + array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4];
    System.out.print("Data saved in '" + f + "'.");
    byte data[] = s.getBytes();
    Path p = Paths.get("./" + f);

    try (OutputStream out = new BufferedOutputStream(
      Files.newOutputStream(p, CREATE, APPEND))) {
      out.write(data, 0, data.length);
    } catch (IOException x) {
      System.err.println(x);
    }
  }
}