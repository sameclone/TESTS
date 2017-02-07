package OCJP8.chap7.streams;

import java.util.Arrays;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class StreamsTest4 {
    public static void main(String[] args){
        System.out.println("Sequential: "+ Arrays.asList(1,2,3,4,5,6).stream().findAny().get());
        System.out.println("Parallel: "+ Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get());
    }
}
