package OCJP8.chap3;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class ConvertingArrayAndArrayList {
    public static void main(String[] args){
        String[] array = {"gerbil","mouse"};
        System.out.println(array);
        List<String> list = Arrays.asList(array);
        System.out.println(list);
        list.set(1,"test");
        System.out.println(list);
        array[0] = "new";
        String[] array2 = (String[])list.toArray();
        System.out.println(array2);
        list.remove(1);//throws java.lang.UnsupportedOperationException
    }
}
