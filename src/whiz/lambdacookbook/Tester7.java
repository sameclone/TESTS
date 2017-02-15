package whiz.lambdacookbook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester7 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(0);
        list.add(3);
        list.add(10);
        list.removeAll(null);
        list.forEach(System.out::print);
    }
}
