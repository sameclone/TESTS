package whiz.lambdacookbook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester16 {
    public static void main(String[] args) throws IOException {
        List<String> list = Files.readAllLines(Paths.get("SongList.txt"));
        list.stream().skip(1).forEach(System.out::println);
    }
}
