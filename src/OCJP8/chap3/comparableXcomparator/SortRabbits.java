package OCJP8.chap3.comparableXcomparator;

import java.util.*;

/**
 * Created by yevgeniya.zuyeva on 10.01.2017.
 */
public class SortRabbits {
    static class Rabbit {
        int id;

        public Rabbit(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Rabbit{" +
                    "id=" + id +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(1));
        rabbits.add(new Rabbit(0));
        rabbits.add(new Rabbit(-3));
        rabbits.add(new Rabbit(10));
        //Collections.sort(rabbits);// Does not compile!!! Java knows that the rabbit is not Comparable!!!

        System.out.println(rabbits);
        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        Collections.sort(rabbits, c);
        System.out.println(rabbits);

        System.out.println("-------");
        List<String> names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c1 = Comparator.reverseOrder();
        int index = Collections.binarySearch(names, "Hoppy", c1);
        System.out.println(index);
        System.out.println("-------");


        Set<Rabbit> rabbitSet1 = new TreeSet<>(new Comparator<Rabbit>() {
            @Override
            public int compare(Rabbit o1, Rabbit o2) {
                return o1.id - o2.id;
            }
        });

        rabbitSet1.add(new Rabbit(11));
        rabbitSet1.add(new Rabbit(1));
        System.out.println(rabbitSet1);

        Set<Rabbit> rabbitSet = new TreeSet<>();
        //java.lang.ClassCastException: OCJP8.chap3.comparableXcomparator.SortRabbits$Rabbit cannot be cast to java.lang.Comparable
        rabbitSet.add(new Rabbit(11));


    }
}
