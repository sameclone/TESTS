package whiz;

import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 08.12.2016.
 */
public class Tester1Q20 {
    public static void main(String[] args){
        Stream<String> ints = Stream.of("A","B","C","D");
        ints.peek(System.out::print).skip(2).count();
    }
}
