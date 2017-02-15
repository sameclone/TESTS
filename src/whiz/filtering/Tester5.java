package whiz.filtering;

import java.util.stream.DoubleStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester5 {
    public static void main(String[] args) {
        DoubleStream dbs = DoubleStream.of(1.0,2.3,2);
        dbs.boxed().filter(d -> d-d.intValue()==0).forEach(System.out::print);
    }
}
