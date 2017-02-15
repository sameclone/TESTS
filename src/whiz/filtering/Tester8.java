package whiz.filtering;

import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester8 {
    public static void main(String[] args) {
        Stream<Integer> st = Stream.of(5, 3, 1);
        System.out.println(st.sorted().peek(System.out::print).findFirst().get());
    }
}
