package OCJP8.chap3.comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 10.01.2017.
 */
public class Squirrel {
    private int weight;
    private String species;

    public Squirrel(String species) {
        if (species == null) throw new IllegalArgumentException("The species must not be null!");
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Squirrel{" +
                "weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }

    public Squirrel(int weight, String species) {
        this.weight = weight;
        this.species = species;
    }

    public static void main(String[] args) {
        class MultiFieldComparator implements Comparator<Squirrel> {

            @Override
            public int compare(Squirrel o1, Squirrel o2) {
                int result = o1.getSpecies().compareTo(o2.getSpecies());
                if (result != 0) return result;
                return o1.getWeight() - o2.getWeight();
            }
        }


        List<Squirrel> squirrels = new ArrayList<>();
        squirrels.add(new Squirrel(10, "specie1"));
        squirrels.add(new Squirrel(10, "Specie1"));
        squirrels.add(new Squirrel(11, "Specie1"));
        squirrels.add(new Squirrel(10, "specie2"));
        squirrels.add(new Squirrel(9, "specie1"));

        System.out.println(squirrels);
        Collections.sort(squirrels, new MultiFieldComparator());
        System.out.println(squirrels);

        class ChainingComparator implements Comparator<Squirrel> {
            @Override
            public int compare(Squirrel o1, Squirrel o2) {
                Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
                c.thenComparingInt(s -> s.getWeight());
                return c.compare(o1, o2);
            }
        }

        System.out.println("-----------");
        List<Squirrel> squirrels2 = new ArrayList<>();
        squirrels2.add(new Squirrel(10, "specie1"));
        squirrels2.add(new Squirrel(10, "Specie1"));
        squirrels2.add(new Squirrel(11, "Specie1"));
        squirrels2.add(new Squirrel(10, "specie2"));
        squirrels2.add(new Squirrel(9, "specie1"));

        System.out.println(squirrels2);
        Collections.sort(squirrels2, new ChainingComparator());
        System.out.println(squirrels2);


    }
}
