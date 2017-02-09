package OCJP8.chap7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/**
 * Created by yevgeniya.zuyeva on 09.02.2017.
 */
public class Tests5 extends RecursiveAction {
    private int start;
    private int end;

    public Tests5(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if(start<0) return;
        else{
            int middle = start+((end-start)/2);
            invokeAll(new Tests5(start,middle), new Tests5(middle, end));
        }

    }

    public static void main(String[] args){
        ForkJoinTask<?> task = new Tests5(0,4);
        ForkJoinPool pool = new ForkJoinPool();
        Object result = pool.invoke(task);
    }
}
