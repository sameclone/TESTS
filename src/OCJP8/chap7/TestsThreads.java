package OCJP8.chap7;

/**
 * Created by yevgeniya.zuyeva on 01.02.2017.
 */
public class TestsThreads {
    public static void main(String[] args){
        System.out.println("begin");
        new ReadInventoryThread().run();
        new Thread(new PrintData()).run();
        new ReadInventoryThread().run();
        System.out.println("end");
    }
}
