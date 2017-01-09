package OCJP8.chap3.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 09.01.2017.
 */
public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SD");
        System.out.println(list);
        list.add(0, "NY");
        System.out.println(list);
        list.set(1,"FL");
        System.out.println(list);
        list.remove("NY");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        System.out.println("----");

        list.add("OH");
        list.add("CO");
        list.add("NJ");
        System.out.println(list);
        String stage = list.get(0);
        System.out.println("stage="+stage);
        System.out.println(list);
        int index = list.indexOf("NJ");
        System.out.println(index);
    }
}
