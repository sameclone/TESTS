package OCJP8.chap7.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class WhaleDataCalculator {

    public int processRecord(int input) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return input + 1;
    }

    public void processAllData(List<Integer> data) {
        data.stream().map(a -> processRecord(a)).count();
    }

    public void processAllDataParallel(List<Integer> data) {
        data.parallelStream().map(a -> processRecord(a)).count();
    }

    public static void main(String[] args) {
        WhaleDataCalculator calculator = new WhaleDataCalculator();

        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 4000; i++) {
            data.add(i);
        }

        long start = System.currentTimeMillis();
        calculator.processAllData(data);
        double time = (System.currentTimeMillis() - start) / 1000.0;

        System.out.println("Tasks complete in: " + time + " seconds");

        start = System.currentTimeMillis();
        calculator.processAllDataParallel(data);
        time = (System.currentTimeMillis() - start) / 1000.0;

        System.out.println("Parallel Tasks complete in: " + time + " seconds");
    }
}
