package OCJP8.chap3.java8additions;

/**
 * Created by yevgeniya.zuyeva on 10.01.2017.
 */
public class Duck {
    int weight;
    String name;

    public Duck(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
