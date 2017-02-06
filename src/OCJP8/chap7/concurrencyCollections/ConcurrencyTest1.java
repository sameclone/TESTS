package OCJP8.chap7.concurrencyCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yevgeniya.zuyeva on 06.02.2017.
 * example of java.util.ConcurrentModificationException
 */
public class ConcurrencyTest1 {

  // static Map<String, Object> foodData = new HashMap<>();
  static Map<String, Object> foodData = new ConcurrentHashMap<>();
    public static void main(String args[]){

        new Thread(new Changer()).start();
        new Thread(new Changer()).start();


    }

   static   class Changer implements Runnable{

       @Override
       public void run() {
           foodData.put("penguin",1);
           foodData.put("flamingo",2);
           for(String key:foodData.keySet()){
               foodData.remove(key);
           }
       }
   }
}
