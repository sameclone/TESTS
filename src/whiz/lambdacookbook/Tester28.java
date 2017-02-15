package whiz.lambdacookbook;

import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester28 {
    public static void main(String[] args){

        IntStream ins = IntStream.iterate(10, n -> n*2).limit(3);
        System.out.println(ins.sum());
    }
}
