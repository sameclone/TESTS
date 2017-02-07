package OCJP8.chap7.concurrencyCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class ConcurrencyTest6 {

    public static void main(String[] args) {
        //   List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4,3,52))); //ConcurrentModificationException
        //  List<Integer> list = new ArrayList( Arrays.asList(4, 3, 52)); //exception
       List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(2);
            service.execute(() -> {
                System.out.println("in execute");
                synchronized (list) {
                    for (Integer in : list) {
                        System.out.print(in + " ");
                        list.add(9);
                    }
                }

                System.out.println();
                System.out.println("size: " + list.size());
            });

            service.execute(() -> {
                System.out.println("in execute");
                synchronized (list) {
                    for (Integer in : list) {
                        System.out.print(in + " ");
                        list.add(92);
                    }
                }

                System.out.println();
                System.out.println("size: " + list.size());
            });
        } finally {
            if (service != null) service.shutdown();
        }
    }
}
