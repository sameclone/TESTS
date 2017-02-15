package whiz.inbuild;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester5 {
    public static void main(String[] args) {
        IntStream ds = IntStream.of(1,2,2,4);
        Stream<String> ste = ds.boxed().map((i)->{return Integer.toString(i);});
        System.out.print(ste.distinct().findFirst());
    }
}
