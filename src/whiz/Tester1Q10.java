package whiz;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * Created by yevgeniya.zuyeva on 08.12.2016.
 */
public class Tester1Q10 {
    public static void main(String[] args){
        Optional<String> ops = Optional.of("1");
      //  OptionalInt op = ops.map(Integer::parseInt);
      //  System.out.println(op);
        OptionalInt op1 = OptionalInt.of(1);
    }
}
