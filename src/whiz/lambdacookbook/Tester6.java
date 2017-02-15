package whiz.lambdacookbook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester6 {
    public static void main(String [ ] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 7);
        map.put(2, 8);
        map.put(3, 6);
        map.put(4, 5);

        map.putIfAbsent(4, 61);
        map.computeIfPresent(3, (k, v) -> null);

        map.values().forEach(System.out::print);
    }
}
