package OCJP8.chap2;

/**
 * Created by yevgeniya.zuyeva on 05.01.2017.
 */
public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait checkTrait){
        if(checkTrait.test(animal)){
            System.out.println(animal);
        }
    }

    public static void main(String[] args){
        print(new Animal("fish",false, true), animal -> animal.isCanHop());
        print(new Animal("kangaroo",true, false), animal -> animal.isCanHop());
    }
}
