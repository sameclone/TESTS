package OCJP8.chap5;

import java.time.*;

/**
 * Created by yevgeniya.zuyeva on 19.01.2017.
 */
public class TestsPeriod {


    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);

        performAnimalEnrichment(start, end);

        System.out.println("--------------");
        Period period = Period.ofMonths(1);
        performAnimalEnrichment(start, end, period);

        Period annually = Period.ofYears(1);
        System.out.println(annually);
        Period quatrely = Period.ofMonths(3);
        System.out.println(quatrely);
        Period everyTreeWeeks = Period.ofWeeks(3);
        System.out.println(everyTreeWeeks);
        Period everyOtherDay = Period.ofDays(2);
        System.out.println(everyOtherDay);
        Period everyYearAndWeek = Period.of(1, 0, 7);
        System.out.println(everyYearAndWeek);

        Period wrong = Period.ofYears(1).ofWeeks(1);
        System.out.println(wrong);

        Period period1 = Period.of(0, 0, 0);
        System.out.println(period1);

        System.out.println("----------");

        System.out.println(Period.of(0, 20, 47));
        System.out.println(Period.ofWeeks(1));
        System.out.println(Period.ofWeeks(2));
        System.out.println(Period.ofWeeks(3));
        System.out.println(Period.ofWeeks(4));
        System.out.println(Period.ofWeeks(5));

        System.out.println("----------");

        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6,15);
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        Period period2 = Period.ofMonths(1);
        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
        System.out.println(time.plus(period)); //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Months

    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }


    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
