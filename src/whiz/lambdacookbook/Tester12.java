package whiz.lambdacookbook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1Z0-809", "1Z0-810", "1Z1-811", "1Z0-803");
        List<String> list2 = list.stream().flatMap(e -> Stream.of(e.split("-")))
                .distinct().sorted().collect(Collectors.toList());
        System.out.println(list2);
    }
}
