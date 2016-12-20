package whiz;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 30.11.2016.
 */
public class Tester2Q35 {
    public static void main(String[] args){
        Stream<Double> stream = Stream.of(12.1,12.5,12.9);
     //   Stream<Integer> list = stream.flatMap(d->Stream.of(d.intValue()));
        Stream<Integer> list = stream.map(d->d.intValue());
        System.out.println(list.collect(Collectors.toSet()));
    }
}
