package OCJP8.chap4;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by yevgeniya.zuyeva on 11.01.2017.
 */
public class TestPredicate {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = z -> z.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));
        System.out.println(p1.test("Trololo"));
        System.out.println(p2.test("Trololo"));

        System.out.println("-------------");

        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));
        System.out.println(b1.test("chooooocken", "chick"));
        System.out.println(b2.test("chooocken", "chick"));

        System.out.println("-------------");

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brow = s -> s.contains("brown");
        Predicate<String> white = s -> s.contains("white");

        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> othernEggs = s -> s.contains("egg") && !s.contains("brown");

        //simpler

        Predicate<String> brownEggs1 = egg.and(brow);
        Predicate<String> otherEggs1 = egg.and(brow.negate());
        Predicate<String> whiteEggs1 = egg.and(white);
        Predicate<String> notWhiteEggs1 = egg.and(white.negate());


    }
}
