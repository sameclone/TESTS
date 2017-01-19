package OCJP8.chap4.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 18.01.2017.
 */
public class TestCollectors {
    public static void main(String[] args) {
        //joining
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(","));
        System.out.println(result);
        System.out.println("-------");

        //averagingInt

        Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
        Double result1 = ohMy1.collect(Collectors.averagingInt(String::length));
        System.out.println(result1);
        System.out.println("-------");

        //collect to Collection

        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears", "tottoro");
        TreeSet<String> result2 = ohMy2.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result2);
        System.out.println("-------");

        //collect to Map

        Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears", "tottoro");
        Map<String, Integer> result3 = ohMy3.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(result3);
        System.out.println("-------");

        //bad example
        //java.lang.IllegalStateException: Duplicate key lions
        /*Stream<String> ohMy4 = Stream.of("lions","tigers","bears","tottoro");
        Map<Integer,String> result4 = ohMy4.collect(Collectors.toMap(String::length, s->s));
        System.out.println(result4);
        System.out.println("-------");
        */

        Stream<String> ohMy5 = Stream.of("lions", "tigers", "bears", "tottoro");
        Map<Integer, String> result5 = ohMy5.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println(result5);
        System.out.println("-------");

        Stream<String> ohMy6 = Stream.of("lions", "tigers", "bears", "tottoro");
        TreeMap<Integer, String> result6 = ohMy6.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));
        System.out.println(result6);
        System.out.println("-------");

        //grouping
        Stream<String> ohMy7 = Stream.of("lions", "tigers", "bears", "tottoro", "lions");
        Map<Integer, List<String>> result7 = ohMy7.collect(Collectors.groupingBy(String::length));
        System.out.println(result7);
        System.out.println("-------");

        //example with downstream collector
        Stream<String> ohMy8 = Stream.of("lions", "tigers", "bears", "tottoro", "lions");
        Map<Integer, Set<String>> result8 = ohMy8.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(result8);
        System.out.println("-------");

        Stream<String> ohMy9 = Stream.of("lions", "tigers", "bears", "tottoro", "lions");
        TreeMap<Integer, Set<String>> result9 = ohMy9.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(result9);
        System.out.println("-------");


        Stream<String> ohMy10 = Stream.of("lions", "tigers", "bears", "tottoro", "lions");
        TreeMap<Integer, List<String>> result10 = ohMy10.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(result10);
        System.out.println("-------");

        //partitioning

        Stream<String> ohMy11 = Stream.of("lions", "tigers", "bears", "tottoro", "lions");
        Map<Boolean, List<String>> result11 = ohMy11.collect(Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(result11);
        System.out.println("-------");


        Stream<String> ohMy12 = Stream.of("lions", "tigers", "bears", "tottoro", "lions");
        Map<Boolean, List<String>> result12 = ohMy12.collect(Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(result12);
        System.out.println("-------");

        Stream<String> ohMy13 = Stream.of("lions", "tigers", "bears", "tottoro", "lions");
        Map<Boolean, Set<String>> result13 = ohMy13.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
        System.out.println(result13);
        System.out.println("-------");

        Stream<String> ohMy14 = Stream.of("lions", "tigers", "bears", "tottoro", "lions");
        Map<Integer, Long> result14 = ohMy14.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(result14);
        System.out.println("-------");


        Stream<String> ohMy15 = Stream.of("lions", "tigers", "bears", "tottoro", "lions");
        Map<Integer, Optional<Character>> result15 = ohMy15.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping((String s) -> s.charAt(0), Collectors.minBy(Comparator.naturalOrder()))));
        System.out.println(result15);
        System.out.println("-------");

        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));
        System.out.println("-------");

        List<Integer> l1 = Arrays.asList(1,2,3);
        List<Integer> l2  = Arrays.asList(4,5,6);
        List<Integer> l3 = Arrays.asList();
        Stream.of(l1,l2,l3).flatMap(x->x.stream()).map(x->x+1).forEach(System.out::println);

    }
}
