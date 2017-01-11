package OCJP8.chap3.java8additions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

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
        Map<String, String> favorites2 = new HashMap<>();
        favorites2.put("Jenny", "Bus Tour");
        favorites2.put("Tom", "Tram");

        String jenny = favorites2.merge("Jenny", "Skyride", mapper);
        String tom = favorites2.merge("Tom", "Skyride", mapper);
        System.out.println("----MERGE----");
        System.out.println(favorites2);
        System.out.println(jenny);
        System.out.println(tom);

        System.out.println("-------");

        //-----
        BiFunction<String, String, String> mapper1 = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> favorites3 = new HashMap<>();
        favorites3.put("Sam", null);
        favorites3.merge("Tom", "Skyride", mapper1);
        System.out.println(favorites3);
        favorites3.merge("Sam", "Skyride", mapper1);
        System.out.println(favorites3);

        System.out.println("-------");
        //removing key when merges()'s mapping function returns null

        BiFunction<String, String, String> mapper2 = (v1, v2) -> null;

        Map<String, String> favorites4 = new HashMap<>();
        favorites4.put("Jenny","Bus Tour");
        favorites4.put("Tom", "Bus Tour");
        System.out.println(favorites4);
        favorites4.merge("Jenny","Skyride",mapper2);
        System.out.println(favorites4);
        favorites4.merge("Sam","Skyride",mapper2);
        System.out.println(favorites4);

        System.out.println("-------");

        //--------compute If Present

        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny",1);
        System.out.println(counts);

        BiFunction<String,Integer,Integer> mapper3 = (k,v)->v+1;
        Integer jenny1 = counts.computeIfPresent("Jenny",mapper3);
        Integer sam1 = counts.computeIfPresent("Sam",mapper3);
        System.out.println(counts);
        System.out.println(jenny1);
        System.out.println(sam1);

        System.out.println("-------");

        //----compute If Absent------
        Map<String, Integer> counts1 = new HashMap<>();
        counts1.put("Jenny",15);
        counts1.put("Tom",null);
        System.out.println(counts1);
        Function<String, Integer> mapper4 = (k)->1;
        Integer jenny2 = counts1.computeIfAbsent("Jenny",mapper4);//15
        Integer sam2 = counts1.computeIfAbsent("Sam",mapper4);//1
        Integer tom2 = counts1.computeIfAbsent("Tom", mapper4);//1
        System.out.println(counts1);
        System.out.println(jenny2);
        System.out.println(sam2);
        System.out.println(tom2);

        //--when null

        counts1.computeIfPresent("Jenny",(k,v)->null);
        System.out.println(counts1);
        counts1.computeIfAbsent("Trololo",(k)->null);
        System.out.println(counts1);
        counts1.computeIfAbsent("Trololo",(k)->1000);
        System.out.println(counts1);




    }
}
