package whiz.inbuild;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester16 {
    public static void main(String [ ] args){
        IntConsumer con =  System.out::print;
        IntStream ins = IntStream.of(1,3,2,4,3).distinct();
        ins.forEach(con);
    }
}
