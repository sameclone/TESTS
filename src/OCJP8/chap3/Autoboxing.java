package OCJP8.chap3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class Autoboxing {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1); //autoboxing
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        System.out.println(numbers);
        numbers.remove(1);//removes 3
        numbers.remove(new Integer(5));//removes 5
        System.out.println(numbers);
        //unboxing
        int num = numbers.get(0);
    }
}
