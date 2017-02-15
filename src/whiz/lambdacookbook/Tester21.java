package whiz.lambdacookbook;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester21 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Cat", "Dog", "Rat");
        Stream<Integer> list = stream.flatMap(s -> Stream.of(s.length()));
        System.out.println(list.collect(Collectors.toSet()));
    }
}
