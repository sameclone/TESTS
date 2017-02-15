package whiz.inbuild;

import java.util.function.Function;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester8 {
    public static void main(String[] args) {
        Function<String,Double> f = Double::parseDouble;
        System.out.println(f.andThen(s -> s*2).apply("1"));
    }
}
