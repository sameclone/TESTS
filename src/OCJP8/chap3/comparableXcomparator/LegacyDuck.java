package OCJP8.chap3.comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 10.01.2017.
 */
public class LegacyDuck implements Comparable {
    private String name;

    public LegacyDuck(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Object o) {
       LegacyDuck legacyDuck = (LegacyDuck)o;//cast because no generics
        return name.compareTo(legacyDuck.name);
    }


    public static void main(String[] args){
        List<LegacyDuck> ducks = new ArrayList<>();
        ducks.add(new LegacyDuck("Quack"));
        ducks.add(new LegacyDuck("Puddles"));
        System.out.println(ducks);
        Collections.sort(ducks);
        System.out.println(ducks);
    }
}
