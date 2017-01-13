package OCJP8.chap4;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Created by yevgeniya.zuyeva on 13.01.2017.
 */
public class TestOperator {
    public static void main(String[] args){

        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = (x)->x.toUpperCase();

        System.out.println(u1.apply("chrip"));
        System.out.println(u2.apply("chrip"));


        System.out.println("--------");

        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd)->string.concat(toAdd);

        System.out.println(b1.apply("baby","chick"));
        System.out.println(b2.apply("baby","chick"));



    }
}
