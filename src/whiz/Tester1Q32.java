package whiz;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 08.12.2016.
 */
public class Tester1Q32 {
    public static void main(String[] args){
        Stream<String> stream = Stream.of("Java","OCAJP","OCPJP");
       // IntStream ins = stream.map(s->s.length());
        //trying convert in stream of Integers

        Stream<Integer> ins = stream.map(s->s.length());
        IntStream ins2 = stream.mapToInt(s->s.length());
    }
}
