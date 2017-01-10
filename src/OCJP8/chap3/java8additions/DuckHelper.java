package OCJP8.chap3.java8additions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by yevgeniya.zuyeva on 10.01.2017.
 */
public class DuckHelper {
    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }

    public static int compareByName(Duck duck1, Duck duck2) {
        return duck1.getName().compareTo(duck2.getName());
    }

    public static void main(String[] args) {

        Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
        //simplier
        Comparator<Duck> byWeight1 = DuckHelper::compareByWeight;

        //static method
        //consumer takes a single parameter and has VOID return statement
        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

        //method on a specific instance
        //predicate is a functional interface than takes one parameter of ANY type and returns boolean
        String str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Predicate<String> lambda2 = s -> str.startsWith(s);

        //call of instance method without knowing the instance in advance
        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();

        //constructor reference
        //Supplier doesn't take any parameters and return ANY type;
        Supplier<ArrayList> methodRef4 = ArrayList::new;
        Supplier<ArrayList> lambda4 = ()->new ArrayList();


    }
}
