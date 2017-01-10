package OCJP8.chap3.comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 10.01.2017.
 */
public class Duck implements Comparable<Duck> {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public String  toString(){
        return name;
    }

    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }

    public static void main(String[] args){
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        System.out.println(ducks);
        Collections.sort(ducks);
        System.out.println(ducks);
    }
}
