package whiz;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by yevgeniya.zuyeva on 02.12.2016.
 */
public class Tester2Q62 {
    public static void main(String[] args){
        LocalDate ld1 = LocalDate.of(2015,11,28);
        LocalDate ld2 = LocalDate.of(2015,11,29);
        long l = ld1.until(ld2, ChronoUnit.HALF_DAYS);
        System.out.println(l);
    }
}
