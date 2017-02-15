package whiz.inbuild;

import java.util.function.Function;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester20 {
    public static void main(String[] args) {
        Function<Double,Double> f = Function.identity();
        System.out.println(f.apply(10.0));
    }
}
