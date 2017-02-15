package whiz.lambdacookbook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester13 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.remove("A");
        map.remove(3, "C");
        map.remove(4, "B");
        map.values().forEach(System.out::print);
    }
}
