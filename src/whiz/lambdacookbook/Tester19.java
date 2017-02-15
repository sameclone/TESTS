package whiz.lambdacookbook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester19 {
    public static void main(String[] args){
        List<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.replaceAll(i -> i/2);
        System.out.println(ints);
        System.out.println(ints.stream().distinct().count());
    }
}
