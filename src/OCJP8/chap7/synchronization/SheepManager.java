package OCJP8.chap7.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yevgeniya.zuyeva on 06.02.2017.
 */
public class SheepManager {
   // private int sheepCount = 0;
    private AtomicInteger sheepCount = new AtomicInteger(0);

    private void incrementAndReport() {
      //  System.out.println((++sheepCount) + " ");
        System.out.println((sheepCount.incrementAndGet()) + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();

            for(int i=0; i<10;i++){
                service.submit(()->manager.incrementAndReport());
            }

        } finally {
            if (service != null) service.shutdown();
        }
    }
}
