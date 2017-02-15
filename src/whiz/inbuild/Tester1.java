package whiz.inbuild;

import java.util.function.IntSupplier;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester1 {
    public static void main(String [ ] args){
        IntSupplier in = () ->Integer.compare(1, 2);
        System.out.println(get(in));
    }

    public static int get(IntSupplier t){
        return t.getAsInt();
    }
}
