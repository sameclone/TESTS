package whiz.filtering;

import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester2 {
    public static void main(String[] args) {
        IntStream ints = IntStream.range(1, 3);
        ints.forEach(System.out::print);
        ints.forEach(i ->System.out.print(i*2)); //exception

    }
}
