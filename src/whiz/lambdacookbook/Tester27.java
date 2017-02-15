package whiz.lambdacookbook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester27 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        System.out.println(list.set(3,"3"));
    }
}
