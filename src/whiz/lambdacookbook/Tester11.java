package whiz.lambdacookbook;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 15.02.2017.
 */
public class Tester11 {
    public static void main(String[] args) {

        IntStream ins = IntStream.of(4, 2, 3);

        IntSummaryStatistics stat = ins.summaryStatistics();
        stat.accept(7);
        System.out.println(stat.getAverage());
    }
}
