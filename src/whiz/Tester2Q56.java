package whiz;

import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 02.12.2016.
 */
public class Tester2Q56 {
    public static void main(String[] args){
        IntStream ins = IntStream.of(11,52,5,10,-3);
        int i = ins.reduce(0, Integer::compare);
        System.out.println(i);
    }
}
