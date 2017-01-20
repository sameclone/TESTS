package OCJP8.chap5.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Created by yevgeniya.zuyeva on 19.01.2017.
 */
public class TestsInstant {

    public static void main(String[] args) throws InterruptedException {

        Instant now= Instant.now();
        Thread.sleep(1000);
        Instant later = Instant.now();
        Duration duration = Duration.between(now,later);
        System.out.println(duration.toMillis());

        LocalDate date = LocalDate.of(2015,5,25);
        LocalTime time = LocalTime.of(11,55,00);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date,time,zone);
        Instant instant = zonedDateTime.toInstant();
        System.out.println(zonedDateTime);
        System.out.println(instant);


        //LocalDateTime localDateTime = LocalDateTime.of(date,time);
        //Instant instant1 = localDateTime.toInstant(); //does not compile

        System.out.println("---------");

        Instant instant1 = Instant.ofEpochSecond(1000);
        System.out.println(instant1);

        System.out.println("---------");

        Instant nexDay = instant.plus(1, ChronoUnit.DAYS);
        System.out.println(nexDay);
        Instant nexHour = instant.plus(1, ChronoUnit.HOURS);
        System.out.println(nexHour);
        //Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS);//java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Weeks
        //Instant nextYear = instant.plus(1, ChronoUnit.YEARS);//java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Years
        //Instant nextMonth = instant.plus(1, ChronoUnit.MONTHS); //java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Months


    }
}
