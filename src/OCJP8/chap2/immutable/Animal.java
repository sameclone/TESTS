package OCJP8.chap2.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 * not immutable because of ArrayList!!!
 */
public final class Animal {
    private final String species;
    private final int age;
    private final ArrayList<String> favoriteFood;

    public Animal(String species, int age, ArrayList<String> favoriteFood) {
        this.species = species;
        this.age = age;
        if(favoriteFood==null){
            throw new RuntimeException("favorite food is required!");
        }
        this.favoriteFood = favoriteFood;
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

    public static void main(String [] args){
      //  List<String> list = Arrays.asList("meat", "more meat");
        ArrayList<String> list = new ArrayList<>();
        list.add("meat");
        list.add("more meat");
        Animal lion = new Animal("lion",10,list);
        AnimalImmutable lionImmutable = new AnimalImmutable("lion",10,list);
        System.out.println(lion.getFavoriteFoodCount());
        System.out.println(lionImmutable.getFavoriteFoodCount());
     //   ArrayList<String> arrayList = (ArrayList<String>)list;
        list.add("grass");
        System.out.println(lion.getFavoriteFoodCount());
        System.out.println(lionImmutable.getFavoriteFoodCount());
    }
}
