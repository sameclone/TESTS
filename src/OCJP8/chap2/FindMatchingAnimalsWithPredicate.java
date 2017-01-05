package OCJP8.chap2;

import java.util.function.Predicate;

/**
 * Created by yevgeniya.zuyeva on 05.01.2017.
 */
public class FindMatchingAnimalsWithPredicate {
    private static void print(Animal animal, Predicate<Animal> animalPredicate){
        if(animalPredicate.test(animal)){
            System.out.println(animal);
        }
    }

    public static void main(String[] args){
        print(new Animal("fish",false, true), animal -> animal.isCanHop());
        print(new Animal("kangaroo",true, false), animal -> animal.isCanHop());
    }
}
