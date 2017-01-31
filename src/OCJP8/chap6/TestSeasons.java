package OCJP8.chap6;

/**
 * Created by yevgeniya.zuyeva on 31.01.2017.
 */
public class TestSeasons {
    enum Seasons {SPRING, SUMMER, FALL , WINTER}

    public static void test(Seasons seasons) {
        switch (seasons) {
            case SPRING:
            case FALL:
                System.out.println("Shorter hours");
                break;
            case SUMMER:
                System.out.println("Longer hours");
                break;
            default:
                assert false: "Invalid season";
        }
    }

    public static void main(String[] args){
        test(Seasons.WINTER);
    }
}
