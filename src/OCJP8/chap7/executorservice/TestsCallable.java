package OCJP8.chap7.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by yevgeniya.zuyeva on 02.02.2017.
 */
public class TestsCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get());

        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
