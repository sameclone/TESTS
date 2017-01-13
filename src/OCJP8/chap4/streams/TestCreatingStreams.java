package OCJP8.chap4.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 13.01.2017.
 */
public class TestCreatingStreams {
    public static void main(String[] args) {

        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElemet = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        System.out.println(empty.count());
        System.out.println(singleElemet.count());
        System.out.println(fromArray.count());

        //------
        System.out.println("----");
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();

        System.out.println(fromList.count());
        System.out.println(fromListParallel.count());

        //infinite streams
        System.out.println("----");
        Stream<Double> randoms = Stream.generate(Math::random);
        randoms.limit(10).forEach(System.out::println);
        System.out.println("----");

        Stream<Integer> oddNumbers = Stream.iterate(1, n->n+2);
        oddNumbers.limit(10).forEach(System.out::println);

        System.out.println("----");

        Stream<String> s = Stream.of("monkey","ape","bonobo");
        Optional<String> min = s.min((s1,s2)->s1.length() - s2.length());
        System.out.println(min);
        min.ifPresent(System.out::println);

        //java.lang.IllegalStateException: stream has already been operated upon or closed
        //Optional<String> min1 = s.min((s2,s1)->s1.length() - s2.length());
       // System.out.println(min1);
       // min1.ifPresent(System.out::println);



    }
}
