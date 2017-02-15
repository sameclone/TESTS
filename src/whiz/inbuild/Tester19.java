package whiz.inbuild;

import java.util.function.LongFunction;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester19 {
    public static void main(String[] args){
        LongStream ls = LongStream.of(1,2,3,4);
        LongFunction<Integer> lnf = l -> (int)l;
        Stream<Integer> ins  = ls.mapToObj(lnf);
    }
}
