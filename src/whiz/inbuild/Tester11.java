package whiz.inbuild;

import java.util.function.ToDoubleBiFunction;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester11 {
    public static void main(String[] args) {
        ToDoubleBiFunction<Integer,Integer> ob = (f1, f2) -> f1+f2;
        System.out.println(ob.applyAsDouble(1,2));
    }
}
