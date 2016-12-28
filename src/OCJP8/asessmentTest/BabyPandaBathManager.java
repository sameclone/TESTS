package OCJP8.asessmentTest;

import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 28.12.2016.
 * forever in runtime
 */
public class BabyPandaBathManager {
    public static void await(CyclicBarrier cb){
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        final CyclicBarrier cb = new CyclicBarrier(3,()->System.out.println("Clean!"));
        ExecutorService service = Executors.newScheduledThreadPool(2);
        IntStream.iterate(1,i->1).limit(12).forEach(i->service.submit(()->await(cb)));
        service.shutdown();
    }
}
