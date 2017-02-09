package OCJP8.chap7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 09.02.2017.
 */
public class Tests11 {
    public static Integer performCount(int exhibitNumber){
        //implemenation omitted

        return 0;
    }


    public static void printResults(Future<?> f){
        try {
            System.out.println(f.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        ExecutorService service = Executors.newSingleThreadExecutor();
        final List<Future<?>> results = new ArrayList<>();
        IntStream.range(0,10).forEach(i->results.add(
                service.submit(()->performCount(i))
        ));

        results.stream().forEach(f->printResults(f));
        service.shutdown();
    }


}
