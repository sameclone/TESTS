package OCJP8.chap7;

/**
 * Created by yevgeniya.zuyeva on 01.02.2017.
 */
public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            for (int i=0; i<500; i++)
                CheckResults.counter++;
        }).start();

        while(CheckResults.counter<100){
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }

        System.out.println("Reached");
    }
}
