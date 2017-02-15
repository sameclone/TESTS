package whiz.inbuild;

import java.util.function.Function;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester22 {
    public static void main(String[] args) {
        Function<String,String> f = Function.identity();
        System.out.println(f.apply("A"));
    }
}
