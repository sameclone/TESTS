package whiz.filtering;

import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester9 {
    public static void main(String[] args) {
        Stream<String> st = Stream.of("O", "C", "P");
        Stream<String> str = st.peek(System.out::print);
        str.count();
    }
}
