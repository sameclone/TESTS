package whiz.inbuild;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester15 {
    public static void main(String[] args) {
        IntStream ins = IntStream.rangeClosed(1,5);
        IntConsumer con = System.out::print;
        con.accept(ins.sum());
    }
}
