package whiz.filtering;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester6 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1.0","1.2","1.6","1.4","1.3");
        DoubleStream ds = stream.mapToDouble(s->Double.valueOf(s)).filter(d -> d>1.3);
        System.out.println(ds.sum());
    }
}
