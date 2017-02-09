package OCJP8.chap7;

import java.util.Arrays;

/**
 * Created by yevgeniya.zuyeva on 09.02.2017.
 */
public class Tests2 {
    public static void main(String[] args){
        Integer i1 = Arrays.asList(1,2,3,4,5).stream().findAny().get();
        synchronized (i1){
            Integer i2 = Arrays.asList(6,7,8,9,10).parallelStream().sorted().findAny().get();
            System.out.println(i1+" "+i2);
        }
    }
}
