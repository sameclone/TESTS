package whiz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by yevgeniya.zuyeva on 05.12.2016.
 */
public class Tester2Q73 {
    public static void main(String[] args){
        List<Integer> ins = new ArrayList<>();
        ins.add(3);
        ins.add(10);
        ins.add(11);
        ins.add(5);

        Predicate<Integer> p = i->i>5;
        Predicate<Integer> p2 = p.and(i->i<10);

        System.out.println(ins.removeIf(p2));
    }
}
