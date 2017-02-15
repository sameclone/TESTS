package whiz.filtering;

import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester14 {
    public static void main(String[] args) {
        Stream<Double>ints = Stream.of(1.1,2.2,3.3);
        ints.filter(d -> d>2.3).forEach(System.out::print);
    }
}
