package whiz.inbuild;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester21 {
    public static void main(String[] args) {

        Consumer<Integer> con = System.out::print;
        Consumer<Integer> cons = con.andThen(in -> System.out.print(in * 3));

        List<Integer> ins = new ArrayList<>();
        ins.add(1);
        ins.add(2);
        ins.add(3);
        ins.forEach(cons);
    }
}
