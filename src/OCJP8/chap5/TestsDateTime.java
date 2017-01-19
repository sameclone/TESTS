package OCJP8.chap5;

import java.time.*;

/**
 * Created by yevgeniya.zuyeva on 19.01.2017.
 */
public class TestsDateTime {
    public static void main(String[] args) {
        System.out.println("Local Date: " + LocalDate.now());
        System.out.println("Local Time: " + LocalTime.now());
        System.out.println("Local Date Time: " + LocalDateTime.now());
        System.out.println("Zoned Date Time: " + ZonedDateTime.now());

        System.out.println("--------------");

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println("Local Date1: " + date1);
        System.out.println("Local Date2: " + date2);

        System.out.println("--------------");

        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);
        LocalTime time4 = LocalTime.of(16, 15, 30, 200);
        // LocalTime time5 = LocalTime.of(25,15,30,200); // Invalid value for HourOfDay (valid values 0 - 23): 25

        System.out.println("Local Time1: " + time1);
        System.out.println("Local Time2: " + time2);
        System.out.println("Local Time3: " + time3);
        System.out.println("Local Time4: " + time4);

        System.out.println("--------------");

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println("Local Date Time1: " + dateTime1);
        System.out.println("Local Date Time2: " + dateTime2);

        System.out.println("--------------");
        ZoneId zone = ZoneId.of("US/Eastern");
        //  ZoneId zone1 = ZoneId.of("blabla/blabla"); //java.time.zone.ZoneRulesException: Unknown time-zone ID: blabla/blabla
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(date1, time1, zone);
        ZonedDateTime zonedDateTime3 = ZonedDateTime.of(dateTime1, zone);

        System.out.println("Zoned Date Time1: " + zonedDateTime1);
        System.out.println("Zoned Date Time2: " + zonedDateTime2);
        System.out.println("Zoned Date Time3: " + zonedDateTime3);
        System.out.println("--------------");

        ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("America") || z.contains("US")).sorted().forEach(System.out::println);

        System.out.println("--------------");

        //   LocalDate d = new LocalDate(); //DOES NOT COMPILE
        //LocalDate.of(2015,Month.JANUARY,32); //java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32


        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println("Plus Day: " + date);
        date = date.plusWeeks(1);
        System.out.println("Plus week: " + date);
        date = date.plusMonths(1);
        System.out.println("Plus month: " + date);
        date = date.plusYears(5);
        System.out.println("Plus years: " + date);

        System.out.println("--------------");

        date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
        dateTime = dateTime.minusDays(1);
        System.out.println("Minus days: " + dateTime);
        dateTime = dateTime.minusHours(10);
        System.out.println("Minus hours: " + dateTime);
        dateTime = dateTime.minusSeconds(30);
        System.out.println("Minus seconds: " + dateTime);

        System.out.println("--------------");

        LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time5 = LocalTime.of(5, 15);
        LocalDateTime dateTime3 = LocalDateTime.of(date3, time5);
        System.out.println("Before: " + dateTime3);
        LocalDateTime dateTime4 = dateTime3.minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println("After: " + dateTime4);

        System.out.println("--------------");
        LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
        date4.plusDays(10);
        System.out.println(date4);

        System.out.println("--------------");
        LocalDate date5 = LocalDate.now();
        //date5  = date.plusMinutes();//DOES NOT COMPILE


    }
}
