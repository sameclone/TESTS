package whiz;

import java.util.Arrays;
import java.util.stream.DoubleStream;

/**
 * Created by yevgeniya.zuyeva on 08.12.2016.
 */
public class Tester1Q35 {
    public static void main(String[] args){
        double [] dbls = {1.0,2.0,3.0,2.0};

        DoubleStream ds = Arrays.stream(dbls);
       // int count = ds.distinct().skip(1).count();
        //need long
        long count = ds.distinct().skip(1).count();

    }
}
