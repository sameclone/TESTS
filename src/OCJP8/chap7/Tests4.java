package OCJP8.chap7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by yevgeniya.zuyeva on 09.02.2017.
 */
public class Tests4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();

        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<?> f1 = service.submit(() -> {
                    synchronized (o1) {
                        synchronized (o2){
                            System.out.println("Totroise");
                        }
                    }
                }
        );

        Future<?> f2 = service.submit(() -> {
                    synchronized (o2) {
                        synchronized (o1){
                            System.out.println("Hare");
                        }
                    }
                }
        );

        f1.get();
        f2.get();

    }
}
