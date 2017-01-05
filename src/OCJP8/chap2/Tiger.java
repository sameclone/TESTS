package OCJP8.chap2;

/**
 * Created by yevgeniya.zuyeva on 05.01.2017.
 */
public class Tiger implements Sprint {
    @Override
    public void sprint(Animal animal) {
        System.out.println("Animal is sprinting fast! "+animal.toString());
    }
}
