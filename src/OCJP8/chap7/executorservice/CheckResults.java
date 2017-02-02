package OCJP8.chap7.executorservice;

import java.util.concurrent.*;

/**
 * Created by yevgeniya.zuyeva on 02.02.2017.
 */
public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) CheckResults.counter++;
            });

            result.get(10, TimeUnit.SECONDS);

            System.out.println("Reached!");

        }
        catch (TimeoutException e){
            System.out.println("Not reached in time!");

        }
        finally {
            if (service != null) service.shutdown();
        }
    }
}
