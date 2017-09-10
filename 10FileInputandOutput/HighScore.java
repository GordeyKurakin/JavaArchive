import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class HighScore {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    // Convert the string to a
    // byte array.
    String n;
    int a;
    System.out.println("You got a high score!\n");
    System.out.print("Please enter your score: ");
    a = keyboard.nextInt();
    System.out.print("Please enter your name: ");
    keyboard.nextLine();
    n = keyboard.nextLine();
    String s = n + ": " + a + "\n";
    System.out.print("Data stored into score.txt.");
    byte data[] = s.getBytes();
    Path p = Paths.get("./score.txt");

    try (OutputStream out = new BufferedOutputStream(
      Files.newOutputStream(p, CREATE, APPEND))) {
      out.write(data, 0, data.length);
    } catch (IOException x) {
      System.err.println(x);
    }
  }
}