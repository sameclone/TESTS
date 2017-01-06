package OCJP8.chap3.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class LegacyAutoboxing {
    public static void main(String[] args){
        List numbers = new ArrayList();
        numbers.add(5);
        //int result = numbers.get(0);//compile error
        int result = (Integer)numbers.get(0);
        System.out.println(result);
    }
}
