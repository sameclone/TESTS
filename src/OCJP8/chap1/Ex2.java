package OCJP8.chap1;

import java.util.ArrayList;

/**
 * Created by yevgeniya.zuyeva on 30.12.2016.
 */
public class Ex2 {
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cow());
        animals.add(new Bird());
        animals.add(new Lion());

        for(Animal animal:animals){
            animal.feed();
        }

    }
}

abstract class Animal {
    abstract void feed();
}

class Cow extends Animal {
    @Override
    void feed() {
        System.out.println("Feeding ...");
        addHay();
    }

    private void addHay() {
        System.out.println("Adding hay");
    }
}

class Bird extends Animal{

    @Override
    void feed() {
        System.out.println("Feeding ...");
        addSeed();
    }

    private void addSeed(){
        System.out.println("Adding seed.");
    }
}

class Lion extends Animal{

    @Override
    void feed() {
        System.out.println("Feeding ...");
        addMeat();
    }
    private void addMeat(){
        System.out.println("Adding meat.");
    }
}
