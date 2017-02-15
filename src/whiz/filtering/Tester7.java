package whiz.filtering;

import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester7 {
    public static void main(String[] args) {
        Stream<String> dbs = Stream.of("paypal", "pyme", "paytoo", "payee");
        dbs.filter(s -> s.startsWith("pay")).filter(s -> s.endsWith("e")).forEach(System.out::print);
    }
}
