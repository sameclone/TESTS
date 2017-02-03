package OCJP8.chap7.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by yevgeniya.zuyeva on 03.02.2017.
 */
public class TestsExecutionService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            service.submit(() -> {
                System.out.println("1=");
                Thread.sleep(1000);
                System.out.println("done");
                return 1;
            });
            service.submit(() -> {
                System.out.println("2=");
                Thread.sleep(2000);
                System.out.println("done");
                return 2;
            });
            service.submit(() -> {
                System.out.println("3=");
                Thread.sleep(3000);
                System.out.println("done");
                return 3;
            });
            service.submit(() -> {
                System.out.println("4=");
                Thread.sleep(4000);
                System.out.println("done");
                return 4;
            });

        } finally {

            if (service != null) service.shutdown();
        }

        if (service != null) {
            service.awaitTermination(1, TimeUnit.SECONDS);

            if (service.isTerminated()) {
                System.out.println("All Tasks finished");
            }
        } else {
            System.out.println("At least one task is still running");
        }
    }
}
