package OCJP8.chap7.streams;

import java.util.Arrays;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class StreamsTest2 {
    public static void main(String[] args) {
        Arrays.asList("jackal", "kangaroo", "lemur").parallelStream().map(s -> {
            System.out.println(s);
            return s.toUpperCase();
        }).forEach(System.out::println);
    }
}
