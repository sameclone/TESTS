package whiz.inbuild;

import java.util.function.Function;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester7 {
    public static void main(String[] args) {

        Function<Double,Integer> mul = d ->d.intValue();
        Function<Integer,String> f = in->in.toString();

        Function<Double,String>func = f.compose(mul);

        System.out.println(func.apply(12.6).length());
    }
}
