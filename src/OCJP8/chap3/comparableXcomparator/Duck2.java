package OCJP8.chap3.comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 10.01.2017.
 */
public class Duck2 implements Comparable<Duck2> {
    private String name;
    private int weight;

    public Duck2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Duck2{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Duck2 o) {
        return name.compareTo(o.name);
    }

    public static void main(String[] args) {

        Comparator<Duck2> byWeight = new Comparator<Duck2>() {
            @Override
            public int compare(Duck2 o1, Duck2 o2) {
                return o1.getWeight() - o2.getWeight();
            }
        };

        List<Duck2> duck2s = new ArrayList<>();
        duck2s.add(new Duck2("Quack",7));
        duck2s.add(new Duck2("Puddle",10));
        System.out.println(duck2s);
        Collections.sort(duck2s);
        System.out.println(duck2s);
        Collections.sort(duck2s,byWeight);
        System.out.println(duck2s);

        Comparator<Duck2> byWeight1= (d1,d2)->d1.getWeight() - d2.getWeight();
        Comparator<Duck2> byWeight2 = (Duck2 d1, Duck2 d2)->d1.getWeight() - d2.getWeight();
        Comparator<Duck2> byWeight3 = ( d1, d2)->{return d1.getWeight() - d2.getWeight();};
        Comparator<Duck2> byWeight4 = (Duck2 d1,Duck2 d2)->{return d1.getWeight() - d2.getWeight();};

    }
}
