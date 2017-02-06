package OCJP8.chap7.concurrencyCollections;

import java.util.Deque;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * Created by yevgeniya.zuyeva on 06.02.2017.
 */
public class ConcurrencyTest2 {
    static Map<String, Object> map = new ConcurrentHashMap<>();
    static Queue<Integer> queue = new ConcurrentLinkedQueue<>();
    static Deque<Integer> deque = new ConcurrentLinkedDeque<>();

    public static void main(String[] args) {

        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            service.submit(new MapChanger());
            service.submit(new QueueChanger());
            service.submit(new DequeChanger());

        }finally {
            if(service!=null)service.shutdown();
        }
    }

    static class MapChanger implements Runnable {

        @Override
        public void run() {
            map.put("zebra", 52);
            map.put("elephant", 10);
            System.out.println("Map "+map);
            System.out.println("Map get "+map.get("elephant"));
            System.out.println("Map "+map);
        }
    }

    static class QueueChanger implements Runnable {

        @Override
        public void run() {
            queue.offer(31);
            System.out.println("QueueChanger "+queue);
            System.out.println("QueueChanger peek "+queue.peek());
            System.out.println("QueueChanger poll "+queue.poll());
            System.out.println("QueueChanger "+queue);
        }
    }

    static class DequeChanger implements Runnable{

        @Override
        public void run() {
            deque.offer(10);
            deque.push(4);
            System.out.println("Dequeue "+deque);
            System.out.println("Dequeue peek "+deque.peek());
            System.out.println("Dequeue poll "+deque.poll());
            System.out.println("Dequeue "+deque);
        }
    }
}
