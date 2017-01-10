package OCJP8.chap3.java8additions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Created by yevgeniya.zuyeva on 10.01.2017.
 */
public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        System.out.println(favorites);
        favorites.put("Jenny", "Tram");
        System.out.println(favorites);

        //putIfAbsent - set value in the map, but this method skips it if value is already set to a non-null value
        Map<String, String> favorites1 = new HashMap<>();
        favorites1.put("Jenny", "Bus Tour");
        System.out.println(favorites1);
        favorites1.putIfAbsent("Jenny", "Tram");
        System.out.println(favorites1);
        favorites1.put("Tom", null);
        System.out.println(favorites1);
        favorites1.putIfAbsent("Sam", "Tram");
        favorites1.putIfAbsent("Tom", "Tram");
        System.out.println(favorites1);


        //merge
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        Map<String,String> favorites2 = new HashMap<>();
        favorites2.put("Jenny","Bus Tour");
        favorites2.put("Tom","Tram");

        String jenny = favorites2.merge("Jenny","Skyride",mapper);
        String tom = favorites2.merge("Tom","Skyride",mapper);
        System.out.println("----MERGE----");
        System.out.println(favorites2);
        System.out.println(jenny);
        System.out.println(tom);

        //


    }
}
