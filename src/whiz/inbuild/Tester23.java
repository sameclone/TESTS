package whiz.inbuild;

import java.util.HashMap;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester23 {

        public static void main(String[] args){
            Map<Integer,Double> map = new HashMap<>();
            map.put(1,1.1);
            map.put(2,2.2);
            map.put(1,3.3);
            ToDoubleBiFunction<Double,Integer> tdf = (a, b) ->  a+b;
            map.forEach((k,v) -> System.out.print(tdf.applyAsDouble(v,k)));
        }
}
