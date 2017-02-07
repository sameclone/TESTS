package OCJP8.chap7.concurrencyCollections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class ConcurrencyTest7 {



    public static void main(String args[]) {
        Map<String, Object> foodData = new ConcurrentHashMap<>();
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(1);
            service.execute(()->{
                foodData.put("penguin", 1);
                foodData.put("flamingo", 2);
                for (String key : foodData.keySet()) {
                    foodData.remove(key);
                }});
           Map<String, Object> foodData1 = Collections.synchronizedMap(new HashMap<>()); //ConcurrentModificationException
            service.execute(()->{
                foodData1.put("penguin", 1);
                foodData1.put("flamingo", 2);
                for (String key : foodData1.keySet()) {
                    foodData1.remove(key);
                }});

        } finally {
            if (service != null) service.shutdown();
        }


    }


}
