package whiz.inbuild;

import java.util.function.Function;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester10 {
    public static void main(String [ ] args) {
        Function<Integer, Double> fun = (s) -> s.doubleValue() * 2;
        System.out.println(fun.compose((Integer d) -> d + 2).apply(10));
    }
}
