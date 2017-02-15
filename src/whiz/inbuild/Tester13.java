package whiz.inbuild;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester13 {
    public static void main(String[] args){

        List<Integer> ints = new ArrayList<>();

        ints.add(10);
        ints.add(20);
        ints.add(30);
        ints.add(40);

        Consumer<Integer> cons = System.out::print;
        Consumer<Integer> con = e ->System.out.print(" "+e*2 + " ");

        cons.andThen(con);
        ints.forEach(cons);
    }
}
