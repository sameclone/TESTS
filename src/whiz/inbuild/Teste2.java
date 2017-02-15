package whiz.inbuild;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Teste2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        UnaryOperator<String> un = UnaryOperator.identity();
        list.forEach(s ->un.apply(s));
        System.out.println(list);
    }
}
