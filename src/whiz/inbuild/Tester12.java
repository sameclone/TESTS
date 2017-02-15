package whiz.inbuild;

import java.util.function.LongUnaryOperator;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester12 {

    public static void main(String[] args){
        LongUnaryOperator lou = l -> l*2;
        long l = lou.compose(lou).applyAsLong(3);
        System.out.println(l);
    }
}
