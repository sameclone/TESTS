package whiz.lambdacookbook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester9 {
    public static void main(String args [ ]) throws IOException {
        Path path = Paths.get(".");
        Stream<Path> out = Files.list(path);
        out.forEach( s ->System.out.print(s + " | "));
    }
}
