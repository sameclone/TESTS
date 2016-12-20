package whiz;

import java.util.function.Function;

/**
 * Created by yevgeniya.zuyeva on 05.12.2016.
 */
public class Tester2Q78 {
    public static void main(String[] args){
        Function<Double,Integer> mul = d->d.intValue();
        Function<Integer, String> f = in->in.toString();
        //Function<Double,String> func = f.compose();
    }
}
