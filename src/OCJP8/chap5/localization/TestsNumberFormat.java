package OCJP8.chap5.localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by yevgeniya.zuyeva on 25.01.2017.
 */
public class TestsNumberFormat {
    public static void main(String[] args) throws ParseException {
        int attandeesPerYear = 3_200_000;
        int attendeesPerMonth = attandeesPerYear / 12;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println("US: " + us.format(attendeesPerMonth));

        NumberFormat germ = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println("Germany: " + germ.format(attendeesPerMonth));

        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println("Canada French: " + ca.format(attendeesPerMonth));

        NumberFormat kazakh = NumberFormat.getInstance(new Locale("kz"));
        System.out.println("Kazakhstan: " + kazakh.format(attendeesPerMonth));

        double price=48;
        NumberFormat currUs = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: "+currUs.format(price));

        NumberFormat currKz = NumberFormat.getCurrencyInstance(new Locale("kz","KZ"));
        System.out.println("KZ: "+currKz.format(price));

        String s = "40.45";
        System.out.println("US: "+us.parse(s));
        System.out.println("Germany"+germ.parse(s));
        System.out.println("Kazakhstan: "+kazakh.parse(s));
        System.out.println("Canada: "+ca.parse(s));

        String amt = "$92,807.99";
        NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
        double value = (Double)cf.parse(amt);
        System.out.println(value);
    }
}
