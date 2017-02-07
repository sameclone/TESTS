package OCJP8.chap7.concurrencyCollections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class ConcurrencyTest3  {

    public static void main(String[] args){

        try {

            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

            blockingQueue.offer(39);
            blockingQueue.offer(3,4, TimeUnit.SECONDS);

            System.out.println(blockingQueue);
            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue);
            System.out.println(blockingQueue.poll(10, TimeUnit.SECONDS));
            System.out.println(blockingQueue);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
