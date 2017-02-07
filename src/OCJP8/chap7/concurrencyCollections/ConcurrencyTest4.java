package OCJP8.chap7.concurrencyCollections;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class ConcurrencyTest4 {
    public static void main(String[] args) {

        try {
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

            blockingDeque.offer(91);
            System.out.println(blockingDeque);
            blockingDeque.offerFirst(5, 2, TimeUnit.SECONDS);
            System.out.println(blockingDeque);
            blockingDeque.offerLast(47,100,TimeUnit.MICROSECONDS);
            System.out.println(blockingDeque);
            blockingDeque.offer(3,4,TimeUnit.SECONDS);
            System.out.println(blockingDeque);

            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque);
            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
            System.out.println(blockingDeque);
            System.out.println(blockingDeque.pollFirst(200,TimeUnit.NANOSECONDS));
            System.out.println(blockingDeque);
            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));
            System.out.println(blockingDeque);



        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
