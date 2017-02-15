package whiz.inbuild;

import java.util.function.UnaryOperator;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester17 {
    public static void main(String[] args) {
        UnaryOperator<String> s = UnaryOperator.identity();
        System.out.println(s.apply("2"));
    }
}
