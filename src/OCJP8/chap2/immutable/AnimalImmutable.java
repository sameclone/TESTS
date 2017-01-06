package OCJP8.chap2.immutable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public final class AnimalImmutable {
    private final int age;
    private final List<String> favoriteFood;
    private final String species;

    public AnimalImmutable(String species, int age, List<String> favoriteFood) {

        this.species = species;
        this.age = age;
        if(favoriteFood==null){
            throw new RuntimeException("favorite food is required!");
        }
         this.favoriteFood = new ArrayList<>();
          for(String food: favoriteFood){
              this.favoriteFood.add(food);
          }
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getFavoriteFoodCount(){
        return  favoriteFood.size();
    }

    public String getFavoriteFood(int index){
        return favoriteFood.get(index);
    }
}
