package whiz.inbuild;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester18 {

    public static void main(String[] args) {
        IntStream ints = IntStream.of(5,10,15);
      //  Stream<String> stngs = ints.boxed().map(Integer::toString);
        Stream<String> stngs = ints.boxed().map(i->Integer.toString(i));
        System.out.println(stngs.findAny());
    }
}
