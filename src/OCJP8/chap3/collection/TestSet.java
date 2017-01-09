package OCJP8.chap3.collection;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by yevgeniya.zuyeva on 09.01.2017.
 */
public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66); //true
        System.out.println(b1);
        boolean b2 = set.add(16); //true
        System.out.println(b2);
        boolean b3 = set.add(66); //false
        System.out.println(b3);
        boolean b4 = set.add(8); //true
        System.out.println(b4);

        for (Integer integer : set) {
            System.out.print(integer + ", ");
        }

        System.out.println("------");

        //treeSet
        set = new TreeSet<>();
        b1 = set.add(66); //true
        System.out.println(b1);
        b2 = set.add(16); //true
        System.out.println(b2);
        b3 = set.add(66); //false
        System.out.println(b3);
        b4 = set.add(8); //true
        System.out.println(b4);

        for (Integer integer : set) {
            System.out.print(integer + ", ");
        }

        System.out.println("\n------");
        //navigable set
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for (int i = 0; i <= 20; i++) {
            navigableSet.add(i); //autoboxing
        }
        for (Integer integer : navigableSet) {
            System.out.print(integer + ", ");
        }
        System.out.println("\n------");
        System.out.println(navigableSet.lower(10));//9
        System.out.println(navigableSet.floor(10));//10
        System.out.println(navigableSet.ceiling(20));//20
        System.out.println(navigableSet.higher(20));//null


    }
}
