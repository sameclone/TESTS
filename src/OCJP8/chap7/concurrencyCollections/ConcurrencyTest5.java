package OCJP8.chap7.concurrencyCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class ConcurrencyTest5 {
    static List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
     //  static List<Integer> list = new ArrayList( Arrays.asList(4, 3, 52)); //java.util.ConcurrentModificationException

    public static void main(String[] args) {

        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(2);
            service.execute(new ListChanger());
            service.execute(new ListChanger());
        } finally {
            if (service != null) service.shutdown();
        }
    }

    static class ListChanger implements Runnable {

        @Override
        public void run() {
            System.out.println("in runnable");
            for (Integer in : list) {
                System.out.print(in + " ");
                list.add(9);
            }

            System.out.println();
            System.out.println("size: " + list.size());
        }
    }

    static class ListChanger2 implements Runnable {

        @Override
        public void run() {
            System.out.println("in runnable");
            for (Integer in : list) {
                System.out.print(in + " ");
                list.add(92);
            }

            System.out.println();
            System.out.println("size: " + list.size());
        }
    }
}
