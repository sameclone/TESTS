package whiz.lambdacookbook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester22 {
    public static void main(String[] args) throws IOException {

        Stream<Path> out = Files.find(Paths.get("."), 2,
                                (p, b) -> p.getFileName().toString().startsWith("S"));

        System.out.println(out.peek(System.out::println).count());

    }
}
