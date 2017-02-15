package whiz.inbuild;

import java.util.function.IntBinaryOperator;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester3 {
    public static void main(String[] args){
        IntBinaryOperator ibo = Integer::compare;
        int x = ibo.applyAsInt(12, 11);
        System.out.println(x);
    }
}
