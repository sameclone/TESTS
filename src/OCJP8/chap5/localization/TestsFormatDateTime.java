package OCJP8.chap5.localization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by yevgeniya.zuyeva on 25.01.2017.
 */
public class TestsFormatDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println("Day of week: " + date.getDayOfWeek());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());
        System.out.println("Day of Year: " + date.getDayOfYear());

        System.out.println("--------------------------");

        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date1, time1);
        System.out.println("ISO_LOCAL_DATE: " + date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("ISO_LOCAL_TIME: " + time1.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("ISO_LOCAL_DATE_TIME: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println("--------------------------");

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime));
        System.out.println(shortDateTime.format(date1));
        //time cannot be formatted as date
        //System.out.println(shortDateTime.format(time1));//java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: DayOfMonth


        System.out.println("--------------------------");

        DateTimeFormatter shortDateTime1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDateTime1));
        System.out.println(date1.format(shortDateTime1));
        //time cannot be formatted as date
        //System.out.println(time1.format(shortDateTime1));//java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: DayOfMonth

        System.out.println("--------------------------");
        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time2 = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println("SHORT: "+shortF.format(dateTime2));
        System.out.println("MEDIUM: "+mediumF.format(dateTime2));

        System.out.println("--------------------------");

        DateTimeFormatter f  = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date3 = LocalDate.parse("01 02 2015", f);
        System.out.println(date3);
        LocalTime time3 = LocalTime.parse("11:22");
        System.out.println(time3);






    }
}
