package OCJP8.chap4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by yevgeniya.zuyeva on 11.01.2017.
 */
public class TestConsumer {
    public static void main(String[] args){
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x->System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");

        System.out.println("-------");

        Map<String,Integer> map = new HashMap<>();
        BiConsumer<String,Integer> b1 = map::put;
        BiConsumer<String, Integer> b2=(k,v)->map.put(k,v);

        b1.accept("chicken",7);
        b2.accept("chick",1);

        System.out.println(map);

        System.out.println("-------");

        Map<String, String> map1 = new HashMap<>();
        BiConsumer<String,String> b3 = map1::put;
        BiConsumer<String, String> b4 = (k,v)->map1.put(k,v);

        b3.accept("chicken","Cluck");
        b4.accept("chick","Tweep");

        Consumer<Map> mapConsumer = System.out::println;

        mapConsumer.accept(map1);
    }
}
