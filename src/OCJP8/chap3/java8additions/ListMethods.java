package OCJP8.chap3.java8additions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 10.01.2017.
 */
public class ListMethods {
    public static void main(String[] args) {
        //removeIf

        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant1");
        list.add("Assistant2");
        list.add("Assistant3");
        list.add("Assistant4");

        System.out.println(list);

        list.removeIf(s->s.startsWith("A"));
        System.out.println(list);

        //replaceAll
        //UnaryOperator takes one parameter and returns a value of the same type

        List<Integer> list1 = Arrays.asList(1,2,3);
        System.out.println(list1);
        list1.replaceAll(x-> x*2);
        System.out.println(list1);

        //looping
        List<String> cats = Arrays.asList("Sctotie","Annie","Ripley");

        //1
        for(String cat:cats){
            System.out.println(cat);
        }

        //2
        cats.forEach(c->System.out.println(c));

        //3
        cats.forEach(System.out::println);

    }
}
