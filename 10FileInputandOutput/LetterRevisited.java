import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

public class LetterRevisited {

  public static void main(String[] args) {
    String s = "+---------------------------------------------------------+\n|                                                    #### |\n|                                                    #### |\n|                                                    #### |\n|                                                         |\n|                                                         |\n|                              Gordey Kurakin             |\n|                              1 Microsoft Way            |\n|                              Redmond, WA 98104          |\n|                                                         |\n+---------------------------------------------------------+";
    byte data[] = s.getBytes();
    Path p = Paths.get("./Letter.txt");

    try (OutputStream out = new BufferedOutputStream(
      Files.newOutputStream(p, CREATE, APPEND))) {
      out.write(data, 0, data.length);
    } catch (IOException x) {
      System.err.println(x);
    }
  }
}