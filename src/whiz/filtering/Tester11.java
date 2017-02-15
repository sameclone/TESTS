package whiz.filtering;

import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester11 {
    public static void main(String[] args) {
        IntStream ints = IntStream.range(1,3);
        ints.peek(s ->System.out.print(s*2)).forEach(System.out::print);
    }
}
