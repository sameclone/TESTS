package whiz.filtering;

import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester13 {
    public static void main(String[] args) {
        IntStream ins = IntStream.range(1,4).parallel();
        ins.forEach(System.out::print);
    }
}
