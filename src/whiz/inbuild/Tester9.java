package whiz.inbuild;

import java.util.function.DoubleSupplier;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester9 {
    public static void main(String[] args) {
        DoubleSupplier sups  = () -> Math.random()*10;
        System.out.println(sups.getAsDouble());
    }
}
