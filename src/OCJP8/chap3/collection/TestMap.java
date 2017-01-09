package OCJP8.chap3.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by yevgeniya.zuyeva on 09.01.2017.
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");

        System.out.println(map);

        String food = map.get("koala");
        System.out.println(food);

        for (String key : map.keySet()) {
            System.out.print(key + ",");
        }

        System.out.println("-----");

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("koala", "bamboo");
        treeMap.put("lion", "meat");
        treeMap.put("giraffe", "leaf");

        System.out.println(treeMap);

        food = treeMap.get("koala");
        System.out.println(food);

        for (String key : treeMap.keySet()) {
            System.out.print(key + ",");
        }

        // treeMap.contains("lion"); //DOES NOT COMPILE!!!!

        System.out.println(treeMap.containsKey("lion")); //true
        System.out.println(treeMap.containsValue("lion"));//false
        System.out.println(treeMap.size());//3
    }
}
