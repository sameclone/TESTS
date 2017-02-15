package whiz.inbuild;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester4 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2,5,6,8);
        Predicate<Integer> lp = (l) -> l>5;
        Consumer<Integer> ins = (in) -> {if(lp.negate().test(in)) System.out.print(in);};
        stream.forEach(ins);
    }
}
