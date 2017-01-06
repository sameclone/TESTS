package OCJP8.chap3.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class UpperBoundedWildcard {

    public static void main(String[] args) {


        // ArrayList<Number> list = new ArrayList<Integer>(); //Does not compile
        List<? extends Number> list = new ArrayList<>();

        //list.add(10); //does not compile because of list becomes logically immutable

        List<? extends Bird> birds = new ArrayList<>();
        //birds.add(new Sparrow()); //does not compile because of list becomes logically immutable
        //birds.add(new Bird()); //does not compile because of list becomes logically immutable
    }

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number : list) {
            count += number.longValue();
        }

        return count;
    }

    private void anyFlyer(List<Flyer> flyer) {
    }

    private void groupOfFlyers(List<? extends Flyer> flyers) {
    }
}

class Bird {
}

class Sparrow extends Bird {
}

interface Flyer {
    void fly();
}

class HangGlider implements Flyer {

    @Override
    public void fly() {
        System.out.println("I can fly like a HangGlider!");
    }
}

class Goose implements Flyer {
    @Override
    public void fly() {
        System.out.println("I can fly like a goose!");
    }
}