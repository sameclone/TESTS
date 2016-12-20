package whiz;

/**
 * Created by yevgeniya.zuyeva on 24.11.2016.
 */
public class Tetster1Q39 {
    static int y=1;

    public static void main(String[] args){
        abstract class Calc{
            public abstract int calc(int x);
        }

        Calc c = new Calc() {
            @Override
            public int calc(int x) {
                return  x-y;
            }
        };

        System.out.println(c.calc(2));
    }

}
