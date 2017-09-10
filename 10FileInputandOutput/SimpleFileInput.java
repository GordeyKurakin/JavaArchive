import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class SimpleFileInput {

  public static void main(String[] args) {

    Path file = Paths.get("./name.txt");;
    try (InputStream in = Files.newInputStream(file);
        BufferedReader reader =
          new BufferedReader(new InputStreamReader(in))) {
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println("Using my psychic powers (aided by reading data from the file), I have determined that your name is " + line + ".");
        }
    } catch (IOException x) {
        System.err.println(x);
    }
  }
}