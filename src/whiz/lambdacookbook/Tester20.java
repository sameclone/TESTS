package whiz.lambdacookbook;

import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester20 {
    public static void main(String[] args) {

        IntStream.Builder b = IntStream.builder();
        b.add(0);
        b.accept(1);
        b.add(2);
        IntStream ins = b.build();
        b.accept(3); //java.lang.IllegalStateException

        ins.forEach(System.out::print);
    }
}
