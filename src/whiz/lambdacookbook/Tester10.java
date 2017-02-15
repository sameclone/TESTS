package whiz.lambdacookbook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester10 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        map2.put("B", 2);
        map2.put("C", 3);

        map.forEach((k,v)->map2.merge(k,v,(i,j) -> j));

        System.out.println("MAP: "+map);
        System.out.println("MAP 2: "+map2);
        map.keySet().forEach(System.out::print);
        map2.values().forEach(System.out::print);

    }
}
