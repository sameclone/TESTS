package OCJP8.chap7.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yevgeniya.zuyeva on 08.02.2017.
 */
public class LionPenManager {
    private void removeAminals(){System.out.println("Removing animals");}
    private void cleanPen(){System.out.println("Cleaning the pen");}
    private void addAnimals(){System.out.println("Adding animals");}

    public void performTask(CyclicBarrier c1, CyclicBarrier c2){

        try {
            removeAminals();
            c1.await();
            cleanPen();
            c2.await();
            addAnimals();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        ExecutorService service=null;
        try{
            service = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4, ()->System.out.println("***Pen cleaned!"));


            for(int i=0;i<4;i++)
            {
                service.submit(()->manager.performTask(c1,c2));
            }


        }finally {
            if (service!=null) service.shutdown();
        }
    }

}
