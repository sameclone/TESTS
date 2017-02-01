package OCJP8.chap7;

/**
 * Created by yevgeniya.zuyeva on 01.02.2017.
 */
public class ReadInventoryThread extends Thread {


    @Override
    public void run() {
        System.out.println("Printing zoo inventory");
    }

    public static void main(String[] args){
        new ReadInventoryThread().start();
    }
}
