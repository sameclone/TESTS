package OCJP8.chap7.streams;

import java.util.Arrays;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class StreamsTest1 {
    public static void main(String[] args){
        System.out.println("Sequential");
        Arrays.asList(1,2,3,4,5,6).stream().forEach(s->System.out.print(s+" "));
        System.out.println("\nParallel");
        Arrays.asList(1,2,3,4,5,6).parallelStream().forEach(s->System.out.print(s+" "));
        System.out.println("\nParallel Ordered");
        Arrays.asList(1,2,3,4,5,6).parallelStream().forEachOrdered(s->System.out.print(s+" "));
    }
}
