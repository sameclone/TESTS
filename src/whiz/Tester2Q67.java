package whiz;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * Created by yevgeniya.zuyeva on 02.12.2016.
 */
public class Tester2Q67 {
    public static void main(String[] args){
        LocalTime lt = LocalTime.of(2,2,15);
        System.out.println(lt.getLong(ChronoField.valueOf("MINUTE_OF_DAY")));
    }
}
