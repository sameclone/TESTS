package collectionsexamples;

import java.util.ArrayList;

/**
 * Created by yevgeniya.zuyeva on 26.12.2016.
 */
public class TestGenerics2 {
    public static void main(String[] args) {
        new TestGenerics2().go();
    }


    public void go() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());


        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        takeAnimals(animals);
        takeAnimals(dogs);
    }

    public void takeAnimals(ArrayList<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }

    }
}
