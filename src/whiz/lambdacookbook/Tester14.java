package whiz.lambdacookbook;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester14 {
    public static void main(String[] args) {
        IntStream ins = IntStream.rangeClosed(0, 8);

        IntSummaryStatistics stat = ins.summaryStatistics();
        stat.accept(0);

        System.out.println(stat.getAverage());
    }
}
