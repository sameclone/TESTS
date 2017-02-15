package whiz.lambdacookbook;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester2 {
    public static void main(String[] args) {
        double[] dbls = {1.0, 2.0, 3.0, 2.0};

        DoubleStream db = Arrays.stream(dbls);
        long count = db.distinct().skip(1).count();
        System.out.println(count);
    }
}
