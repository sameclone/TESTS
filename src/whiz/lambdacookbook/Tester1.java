package whiz.lambdacookbook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("and");
        list.add("an");
        list.add("animal");
        list.add("Ant");
        list.removeIf(e -> e.startsWith("an"));
        System.out.println(list);
    }
}
