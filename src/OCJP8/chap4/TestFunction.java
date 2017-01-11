package OCJP8.chap4;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by yevgeniya.zuyeva on 11.01.2017.
 */
public class TestFunction {
    public static void main(String[] args){

        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x->x.length();

        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));

        System.out.println("--------");

        BiFunction<String,String,String> b1 = String::concat;
        BiFunction<String,String,String> b2 = (string, toAdd)->string.concat(toAdd);
        BiFunction<String,String,String> b3 = (toAdd, string)->string.concat(toAdd);

        System.out.println(b1.apply("baby","chick"));
        System.out.println(b2.apply("baby","chick"));
        System.out.println(b3.apply("baby","chick"));

    }
}
