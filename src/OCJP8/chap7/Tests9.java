package OCJP8.chap7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 09.02.2017.
 */
public class Tests9 {

    public static void await(CyclicBarrier cb){
        try {
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        CyclicBarrier cb = new CyclicBarrier(10,()->System.out.println( "Stock Room Full!!!"));

        IntStream.iterate(1,i->1).limit(9).parallel().forEach(i->await(cb));
    }
}
