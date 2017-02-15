package whiz.lambdacookbook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester8 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        System.out.println(map);
        map.compute(3, (k,v)->v.equals("C")?null:"A");
        System.out.println(map);
        map.keySet().forEach(System.out::print);
    }
}
