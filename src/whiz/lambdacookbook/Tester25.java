package whiz.lambdacookbook;

import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester25 {
    public static void main(String[] args) {
        IntStream ins = IntStream.range(2, 4);
        ins.limit(2).map(x -> x*2).forEach(System.out::print);
    }
}
