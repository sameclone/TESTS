package OCJP8.chap2.factory;

import OCJP8.chap2.builder.Animal;
import OCJP8.chap2.builder.AnimalBuilder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class ZooKeeper {
    public static void main(String[] args){
       ArrayList <Animal> animals = new ArrayList<>();
       animals.add(new AnimalBuilder().setAge(10).setSpecies("rabbit").setFivoriteFood(Arrays.asList("carrot")).build());
       animals.add(new AnimalBuilder().setAge(20).setSpecies("polar bear").setFivoriteFood(Arrays.asList("fish")).build());
       animals.add(new AnimalBuilder().setAge(12).setSpecies("goat").setFivoriteFood(Arrays.asList("grass")).build());
       animals.add(new AnimalBuilder().setAge(12000).setSpecies("dino").setFivoriteFood(Arrays.asList("meat")).build());

       for(Animal a: animals){
           FoodFactory.getFood(a.getSpecies()).consumed();
       }
    }
}
