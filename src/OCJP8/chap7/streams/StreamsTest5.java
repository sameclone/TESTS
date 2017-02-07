package OCJP8.chap7.streams;

import java.util.Arrays;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class StreamsTest5 {
    public static void main(String[] args) {
        System.out.println("Sequential: "+Arrays.asList('B', 'A', 'D', ' ', 'W', 'O', 'L', 'F')
                .stream()
                .reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3));
        System.out.println("Parallel: "+Arrays.asList('B', 'A', 'D', ' ', 'W', 'O', 'L', 'F')
                .parallelStream()
                .reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3));

        System.out.println("Sequential: "+Arrays.asList(1,2,3,4,5,6).stream().reduce(0,(a,b)->(a-b)));
        System.out.println("Parallel: "+Arrays.asList(1,2,3,4,5,6).parallelStream().reduce(0,(a,b)->(a-b)));

        System.out.println("Sequential: "+Arrays.asList("B", "A", "D", " ", "W", "O", "L", "F")
                .stream()
                .reduce("X", String::concat));

        System.out.println("Parallel: "+Arrays.asList("B", "A", "D", " ", "W", "O", "L", "F")
                .parallelStream()
                .reduce("X", String::concat));
    }
}
