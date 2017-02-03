package OCJP8.chap7.executorservice;

import java.time.LocalTime;
import java.util.concurrent.*;

/**
 * Created by yevgeniya.zuyeva on 03.02.2017.
 */
public class TestsScheduledExecutorService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = null;

        try {
            service = Executors.newSingleThreadScheduledExecutor();
            Runnable command = () -> {
                System.out.println("Runnable: " + LocalTime.now());
            };

            Callable<String> command2 = () -> "Callable: " + LocalTime.now();

            System.out.println("Started at: " + LocalTime.now());

            Future<?> result1 = service.schedule(command, 10, TimeUnit.SECONDS);
            Future<?> result2 = service.schedule(command2, 1, TimeUnit.MINUTES);

            System.out.println("result 2: " + result2.get());
            System.out.println("Ended at: " + LocalTime.now());



        } finally {

            if (service != null) service.shutdown();
        }
    }

}
