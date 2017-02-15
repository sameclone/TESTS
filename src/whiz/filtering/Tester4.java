package whiz.filtering;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester4 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("a");
        lst.add("ab");

        lst.stream().forEach(s -> System.out.print(s.length()));/*.forEach(System.out::print);*/ //compile time error
    }
}
