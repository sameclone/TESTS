package whiz.lambdacookbook;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester29 {
    public static void main(String[] args) {
        double[] arr = {1.1,2.2,3.3,4.4,5.5};
        DoubleStream dbs = Arrays.stream(arr, 3, 5);
        System.out.println(dbs.sum());
    }
}
