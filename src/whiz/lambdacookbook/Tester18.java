package whiz.lambdacookbook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester18 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.merge("4", 4, (k, v) -> v > 0 ? null : 0);
        System.out.println(map.keySet());
    }
}
