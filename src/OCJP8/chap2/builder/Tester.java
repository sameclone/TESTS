package OCJP8.chap2.builder;

import java.util.Arrays;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class Tester {
    public static void main(String[] args) {
        AnimalBuilder duckBuilder = new AnimalBuilder();
        duckBuilder.setAge(4).setFivoriteFood(Arrays.asList("grass", "fish")).setSpecies("duck");

        Animal duck = duckBuilder.build();
        System.out.println(duck);

        Animal flamingo = new AnimalBuilder().setFivoriteFood(Arrays.asList("algae", "fish")).setSpecies("flamingo").build();
        System.out.println(flamingo);

    }
}
