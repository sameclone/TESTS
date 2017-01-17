package OCJP8.chap4.streams;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 17.01.2017.
 */
public class TestIntermediateOperations {

    public static void main(String[] args) {
        //filter
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::println);
        System.out.println("--------");

        //distinct
        Stream<String> s1 = Stream.of("duck", "duck", "duck", "goose");
        s1.distinct().forEach(System.out::println);
        System.out.println("--------");

        //limit and skip
        Stream<Integer> s2 = Stream.iterate(1, n -> n + 1);
        s2.skip(5).limit(2).forEach(System.out::println);
        System.out.println("--------");

        Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
        s3.limit(2).skip(3).forEach(System.out::println);
        System.out.println("--------");

        //map

        Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo", "ape", "Tarzan");
        s4.map(String::length).forEach(System.out::println);
        System.out.println("--------");

        Stream<String> s5 = Stream.of("monkey", "gorilla", "bonobo", "ape", "Tarzan");
        s5.map(x -> x.charAt(0)).forEach(System.out::println);
        System.out.println("--------");

        //flatMap
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);
        System.out.println("--------");
        Stream<List<String>> animals1 = Stream.of(zero, one, two);
        animals1.map(l -> l.stream()).forEach(System.out::println);
        System.out.println("--------");

        //sorted
        Stream<String> s6 = Stream.of("brown-", "bear-");
        s6.sorted().forEach(System.out::println);
        System.out.println("--------");

        Stream<String> s7 = Stream.of("brown bear - ", "grizzly - ");
        s7.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //s7.sorted(Comparator::reverseOrder);//DOES NOT COMPILE!!!!
        System.out.println("--------");

        //peek
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(ss -> ss.startsWith("g")).peek(System.out::println).count();
        System.out.println(count);
        System.out.println("--------");

        List<Integer> numbers = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        letters.add('a');
        Stream<List<?>> stream2 = Stream.of(numbers, letters);
        stream2.map(List::size).forEach(System.out::println);

        System.out.println("--------");
        StringBuilder builder = new StringBuilder();
        Stream<List<?>> good = Stream.of(numbers,letters);
        good.peek(l->builder.append(l)).map(List::size).forEach(System.out::println);
        System.out.println(builder);
        System.out.println("--------");
        Stream<List<?>> bad = Stream.of(numbers,letters);
        bad.peek(l->l.remove(0)).map(List::size).forEach(System.out::println);





    }
}
