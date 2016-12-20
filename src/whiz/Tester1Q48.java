package whiz;

/**
 * Created by yevgeniya.zuyeva on 25.11.2016.
 */
public class Tester1Q48 {
    public static void main(String[] args) {
        I i = new I() {
        };
          i.print();
         I.method();
    }
}

interface I{
    public default void print(){
        System.out.print("I");
    }

    public static void method(){
        System.out.print("Static");
    }
}