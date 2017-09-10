import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class DisplayingAFile {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String fil;
    System.out.print("Open which file: ");
    fil = keyboard.nextLine();
    Path file = Paths.get("./" + fil);;
    try (InputStream in = Files.newInputStream(file);
        BufferedReader reader =
          new BufferedReader(new InputStreamReader(in))) {
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException x) {
        System.err.println(x);
    }
  }
}