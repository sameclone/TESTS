package OCJP8.chap4.streams;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 17.01.2017.
 */
public class TestPipeline {
    public static void main(String[] args) {

        //old style
        List<String> list = Arrays.asList("Toby", "Anna", "Leory", "Alex", "Tarzan");
        List<String> filtered = new ArrayList<>();
        System.out.println(list);
        for (String name : list) {
            if (name.length() == 4) filtered.add(name);
        }

        Collections.sort(filtered);
        Iterator<String> iterator = filtered.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---------");

        list.stream().filter(str -> str.length() == 4).sorted().limit(2).forEach(System.out::println);
        System.out.println("---------");

        list.stream().filter(str -> str.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("---------");

        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::println);

        System.out.println("---------");

        Stream<Integer> infinite1 = Stream.iterate(1, x -> x + 1);
        infinite1.limit(5)
                .peek(x->System.out.println("in peek->"+x))
                .filter(x->x%2==1)
                .forEach(System.out::println);

        System.out.println("---------");

        Stream<Integer> infinite2 = Stream.iterate(1, x -> x + 1);
        infinite2.filter(x->x%2==1)
                .peek(x->System.out.println("in peek->"+x))
                .limit(5)
                .forEach(System.out::println);



    }
}
