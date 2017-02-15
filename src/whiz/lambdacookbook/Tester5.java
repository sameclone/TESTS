package whiz.lambdacookbook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester5 {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        System.out.println(map);
        map.computeIfPresent(1, (k,v) -> k>1?"a":null);
        System.out.println(map);
        map.computeIfAbsent(1, k ->map.get(k+1) );
        System.out.print(map.values());
    }
}
