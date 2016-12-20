package whiz;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

/**
 * Created by yevgeniya.zuyeva on 02.12.2016.
 */
public class Tester2Q61 {
    public static void main(String[] args){
        Year y = Year.of(2015);
        LocalDate ld = y.atMonthDay(MonthDay.of(4,10));
        System.out.println(ld);
    }
}
