package OCJP8.chap4.lambdas;

/**
 * Created by yevgeniya.zuyeva on 11.01.2017.
 */
public class GorillaFamily {
    String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }

    void play(Gorilla g) {
        System.out.println(g.move());
    }


    public static void main(String[] args) {
        GorillaFamily family = new GorillaFamily();
        family.everyonePlay(true);
        family.everyonePlay(false);
    }
}
