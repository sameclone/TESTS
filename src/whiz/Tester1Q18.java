package whiz;

import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 08.12.2016.
 */
public class Tester1Q18 {
    public static void main(String[] args){
        Stream<Double> stream = Stream.of(1.1,2.2,3.3);
        stream.filter(d->d>1.3);
        stream.filter(d->d>2.3).forEach(System.out::print);
    }
}
