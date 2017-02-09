package OCJP8.chap7;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by yevgeniya.zuyeva on 09.02.2017.
 */
public class Tests3 {
    public static void main(String[] args){
        System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
            .parallelStream()
                .parallel()
            //    .reduce(0,(c1,c2)->c1.length()+c2.length(),(s1, s2)->s1+s2) //does not compile
                //problem c1 is string but c2 is int
        );

    }
}
