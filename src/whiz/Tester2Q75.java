package whiz;

import java.util.function.IntBinaryOperator;

/**
 * Created by yevgeniya.zuyeva on 05.12.2016.
 */
public class Tester2Q75 {
    public static void main(String[] args){
        IntBinaryOperator ibo = Integer::compare;
        int x = ibo.applyAsInt(12,11);
        System.out.println(x);
    }
}
