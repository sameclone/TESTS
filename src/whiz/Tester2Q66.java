package whiz;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * Created by yevgeniya.zuyeva on 02.12.2016.
 */
public class Tester2Q66 {
    public static void main(String[] args){
        LocalDate ld = LocalDate.of(2015,12,12);
        ld = ld.with(ChronoField.DAY_OF_YEAR,30);
        System.out.println(ld);
    }
}
