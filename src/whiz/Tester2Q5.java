package whiz;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 29.11.2016.
 */
public class Tester2Q5 {
    public static void main(String[] args){
        Stream<String> streams = Stream.of("OCAJP","OCM");
        Optional<String> ops = streams.findAny();
       // ops.ofNullable(null).ifPresent(System.out::println);
        ops.ifPresent(System.out::println);
        System.out.println(ops);
    }
}
