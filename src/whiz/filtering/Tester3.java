package whiz.filtering;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester3 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("A");
        lst.add("a");
        lst.add("Ba");

        lst.forEach(System.out::print);
    }
}
