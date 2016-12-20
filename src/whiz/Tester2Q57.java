package whiz;

import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 02.12.2016.
 */
public class Tester2Q57 {
    public static void main(String[] args){
        Stream<String> ins = Stream.of("1","2","3","2","1").distinct();
        String result = ins.collect(StringBuilder::new, StringBuilder::append,StringBuilder::append).toString();
        System.out.println(result);
    }
}
