package OCJP8.chap4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * Created by yevgeniya.zuyeva on 11.01.2017.
 */
public class TestSupplier {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("-------");

        Supplier<StringBuilder> s3 = StringBuilder::new;
        Supplier<StringBuilder> s4 = () -> new StringBuilder();

        System.out.println(s3.get());
        System.out.println(s4.get());

        System.out.println("-------");

        Supplier<ArrayList<String>> s5 = ArrayList<String>::new;
        ArrayList<String> a1 = s5.get();
        System.out.println(a1);
        System.out.println(s5);



    }
}
