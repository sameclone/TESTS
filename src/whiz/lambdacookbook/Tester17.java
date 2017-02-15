package whiz.lambdacookbook;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester17 {
    public static void main(String[] args){
        Stream<String> stream = Stream.of("Java","OCAJP","OCPJP");
        IntStream ins = stream.mapToInt(s ->s.length());
        ins.forEach(System.out::print);
    }
}
