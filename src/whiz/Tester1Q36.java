package whiz;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Created by yevgeniya.zuyeva on 08.12.2016.
 */
public class Tester1Q36 {
    public static void main(String[] args){
        IntStream ins = IntStream.of(10,20,30,40);
        IntSummaryStatistics stat = ins.summaryStatistics();
      //  stat.accept(stat.getCount());//excepts int but getCount() returns long
        System.out.println(stat.getSum());
    }
}
