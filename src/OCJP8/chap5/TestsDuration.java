package OCJP8.chap5;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

/**
 * Created by yevgeniya.zuyeva on 19.01.2017.
 */
public class TestsDuration {
    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1);
        System.out.println(daily);
        Duration hourly = Duration.ofHours(1);
        System.out.println(hourly);
        Duration everyMinute = Duration.ofMinutes(1);
        System.out.println(everyMinute);
        Duration everyTenSeconds = Duration.ofSeconds(10);
        System.out.println(everyTenSeconds);
        Duration everyMili = Duration.ofMillis(1);
        System.out.println(everyMili);
        Duration everyNano = Duration.ofNanos(1);
        System.out.println(everyNano);

        System.out.println(Duration.ofSeconds(3600));

        System.out.println("-----------");
        Duration daily1 = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(daily1);
        Duration hourly1 = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(hourly1);
        Duration everyMinute1 = Duration.of(1, ChronoUnit.MINUTES);
        System.out.println(everyMinute1);
        Duration everyTenSeconds1 = Duration.of(10, ChronoUnit.SECONDS);
        System.out.println(everyTenSeconds1);
        Duration everyMili1 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(everyMili1);
        Duration everyNano1 = Duration.of(1, ChronoUnit.NANOS);
        System.out.println(everyNano1);

        System.out.println("-----------");

        LocalTime oneTime = LocalTime.of(5, 15);
        LocalTime twoTime = LocalTime.of(6, 30);
        LocalDate date = LocalDate.of(2016, 1, 20);

        System.out.println(ChronoUnit.HOURS.between(oneTime, twoTime));
        System.out.println(ChronoUnit.MINUTES.between(oneTime, twoTime));
        //System.out.println(ChronoUnit.MINUTES.between(oneTime,date)); //java.time.DateTimeException: Unable to obtain LocalTime from TemporalAccessor: 2016-01-20 of type java.time.LocalDate

        System.out.println("-----------");

        LocalDate date1 = LocalDate.of(2015, 1, 20);
        LocalTime time1 = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date1, time1);
        Duration duration = Duration.ofHours(6);
        System.out.println(dateTime.plus(duration));
        System.out.println(time1.plus(duration));
        //System.out.println(date1.plus(duration)); //java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds

        System.out.println("-----------");

        LocalDate date2 = LocalDate.of(2015, 1, 20);
        LocalTime time2 = LocalTime.of(6, 15);
        LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
        Duration duration2 = Duration.ofHours(23);
        System.out.println(dateTime2.plus(duration2));
        System.out.println(time2.plus(duration2));
        //System.out.println(date2.plus(duration2)); //java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds


        System.out.println("-----------");

        LocalDate date3 = LocalDate.of(2015, 5, 25);
        Period period3 = Period.ofDays(1);
        Duration duration3 = Duration.ofDays(1);

        System.out.println(date3.plus(period3));
        //System.out.println(date3.plus(duration3)); //java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds



    }
}
