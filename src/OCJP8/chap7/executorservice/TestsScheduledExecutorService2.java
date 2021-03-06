package OCJP8.chap7.executorservice;

import java.time.LocalTime;
import java.util.concurrent.*;

/**
 * Created by yevgeniya.zuyeva on 03.02.2017.
 */
public class TestsScheduledExecutorService2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService service = null;

        try {
            service = Executors.newSingleThreadScheduledExecutor();
            Runnable command = () -> {
                System.out.println("Runnable: " + LocalTime.now());
            };

            System.out.println("Started at: " + LocalTime.now());
            Future<?> result1 = service.scheduleAtFixedRate(command, 10,5 ,TimeUnit.SECONDS);

           // for(int i=0; i<10; i++)
          //  {
                System.out.println(":"+result1.get());
          //  }

            System.out.println("Ended at: " + LocalTime.now());



        } finally {

            if (service != null) service.shutdown();
        }
    }
}
