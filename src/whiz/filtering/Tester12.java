package whiz.filtering;

import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester12 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "AB", "ABC", "ABCD", "AB");
        String out = stream.filter(s -> s.length() > 2).
                filter(s -> s.indexOf("C") > -1).findAny().orElse("None");
        System.out.println(out);
    }
}
