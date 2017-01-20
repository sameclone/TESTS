package OCJP8.chap5.datetime;

import java.time.*;

/**
 * Created by yevgeniya.zuyeva on 20.01.2017.
 */
public class TestsDayLight {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(zonedDateTime);

        zonedDateTime = zonedDateTime.plusHours(1);
        System.out.println("Surprise, mthfckr!!!! " + zonedDateTime);

        System.out.println("--------");

        LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 6);
        LocalTime time1 = LocalTime.of(1, 30);
        ZoneId zone1 = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(date1, time1, zone1);
        System.out.println(zonedDateTime1);

        zonedDateTime1 = zonedDateTime1.plusHours(1);
        System.out.println("Surprise Again, mthfckr!!!! " + zonedDateTime1);

        System.out.println("--------");

        LocalDate date2 = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time2 = LocalTime.of(2, 30);
        ZoneId zone2 = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date2,time2,zone2);
        System.out.println("Surprise !!! "+dateTime);


    }
}
