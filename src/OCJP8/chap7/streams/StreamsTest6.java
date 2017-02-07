package OCJP8.chap7.streams;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class StreamsTest6 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
        System.out.println(set);

        System.out.println("------------");
        Stream<String> stream1 = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set1 = stream1.collect(TreeSet::new, Set::add, Set::addAll);
        System.out.println(set1);

        System.out.println("------------");
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        SortedSet<String> set2 = stream2.collect(TreeSet::new, Set::add, Set::addAll);
        System.out.println(set2);

        System.out.println("------------");
        Stream<String> stream3 = Stream.of("w", "o", "l", "f").parallel();
        Set<String> set3 = stream3.collect(Collectors.toSet());
        System.out.println(set3);

        System.out.println("------------");
        Stream<String> stream4 = Stream.of("w", "o", "l", "f").parallel();
        List<String> set4 = stream4.collect(Collectors.toList());
        System.out.println(set4);

    }
}
