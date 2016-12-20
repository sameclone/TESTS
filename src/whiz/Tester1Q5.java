package whiz;

import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 07.12.2016.
 */
public class Tester1Q5 {
    public static void main(String[] args){
        Stream<String> stream = Stream.of("abc","ab");
        System.out.println(stream.max((s1,s2)->Integer.compare(s2.length(),s1.length())).get());
    }
}
