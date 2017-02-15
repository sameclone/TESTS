package whiz.lambdacookbook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester3 {

    public static void main(String[] args){
        try (Stream<Path> stream = Files.walk(Paths.get("."), 0)) {


            System.out.println(stream.peek(System.out::println).count());

        }catch(IOException e){

            e.printStackTrace();
        }
    }
}
