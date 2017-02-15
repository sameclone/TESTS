package whiz.lambdacookbook;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester4 {
    public static void main(String[] args){

        Stream<Double> stream = Stream.of(12.1,12.5,12.9);
        Stream<Integer> list = stream.flatMap(d -> Stream.of(d.intValue()));
        System.out.println(list.collect(Collectors.toSet()));
    }
}
