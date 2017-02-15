package whiz.lambdacookbook;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester23 {
    public static void main(String[] args) {
        IntStream ins = IntStream.of(10, 20, 30, 40);
        IntSummaryStatistics stat = ins.summaryStatistics();
        stat.accept((int) stat.getCount());
        System.out.println(stat.getSum());
    }
}
