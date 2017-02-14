package whiz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by yevgeniya.zuyeva on 14.02.2017.
 */
public class Tester3Q77 {
    public static void main(String[] args){
        Consumer<Integer> com = System.out::print;
        Consumer<Integer> cons = com.andThen(in->System.out.print(in*3));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(cons);
     }
}
