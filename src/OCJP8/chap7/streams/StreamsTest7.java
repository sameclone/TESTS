package OCJP8.chap7.streams;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 08.02.2017.
 */
public class StreamsTest7 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears", "tottoro").parallel();
        ConcurrentMap<Integer, String> map = ohMy.collect(Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println(map);
        System.out.println(map.getClass());

        System.out.println("------------------");

        Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears", "tottoro").parallel();
        ConcurrentMap<Integer, List<String>> map1 = ohMy1.collect(Collectors.groupingByConcurrent(String::length));
        System.out.println(map1);
        System.out.println(map1.getClass());
    }
}
