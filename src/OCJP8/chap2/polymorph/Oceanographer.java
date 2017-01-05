package OCJP8.chap2.polymorph;

/**
 * Created by yevgeniya.zuyeva on 05.01.2017.
 */
public class Oceanographer {
    public void checkSound(LivesInOcean animal){
        animal.makeSound();
    }

    public static void main(String[] args){
        Oceanographer o = new Oceanographer();
        o.checkSound(new Dolphin());
        o.checkSound(new Whale());
    }
}
