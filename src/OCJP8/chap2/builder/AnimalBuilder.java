package OCJP8.chap2.builder;

import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class AnimalBuilder {
    private String species;
    private int age;
    private List<String> favoriteFood;

    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimalBuilder setFivoriteFood(List<String> favoriteFood) {
        this.favoriteFood = favoriteFood;
        return this;
    }

    public Animal build() {
        return new Animal(species, age, favoriteFood);
    }
}
