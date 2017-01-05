package OCJP8.chap2.polymorph;

/**
 * Created by yevgeniya.zuyeva on 05.01.2017.
 */
public class Whale implements LivesInOcean {
    @Override
    public void makeSound() {
        System.out.println("sing");
    }
}
