package whiz.lambdacookbook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester24 {
    public static void main(String[] args) {
        Map<Integer,Double> map = new HashMap<>();
        map.put(1, 1.0);
        map.put(2, 2.0);
        map.put(3, 3.0);
        map.put(4, 4.4);
     //   map.putIfPresent(4, null); // not suchmetod
        map.keySet().forEach(System.out::print);
    }
}
