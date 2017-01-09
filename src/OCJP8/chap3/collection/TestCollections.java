package OCJP8.chap3.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yevgeniya.zuyeva on 09.01.2017.
 */
public class TestCollections {
    public static void main(String[] args) {

        //boolean add (E element)
        List<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); //true
        System.out.println(list.add("Sparrow")); //true

        Set<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow"));//true
        System.out.println(set.add("Sparrow"));//false

        //boolean remove(Object o)
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal")); //false
        System.out.println(birds.remove("hawk")); //true
        System.out.println(birds);

        //isEmpty() and size
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());

        //void clear()

        birds.clear();
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());

        //boolean contains(Object o)
        birds.add("hawk");
        System.out.println(birds.contains("hawk"));
        System.out.println(birds.contains("robin"));


    }
}
