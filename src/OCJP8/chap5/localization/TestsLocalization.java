package OCJP8.chap5.localization;

import java.util.Locale;

/**
 * Created by yevgeniya.zuyeva on 20.01.2017.
 */
public class TestsLocalization {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println("----------");

        System.out.println("Locale.GERMAN=" + Locale.GERMAN);
        System.out.println("Locale.GERMANY=" + Locale.GERMANY);

        System.out.println("----------");

        System.out.println("new Locale fr=" + new Locale("fr"));
        System.out.println("new Locale hindi in India=" + new Locale("hi", "IN"));

        System.out.println("----------");

        System.out.println("new Locale fr=" + new Locale("BLAblqlqlqlq"));
        System.out.println("new Locale hindi in India=" + new Locale("hiiiiiiiiiii", "INNNNNNNNNNNN"));

        System.out.println("----------");

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println("-----I wanna do bad things with U-----");

        Locale l3 = new Locale.Builder()
                .setRegion("en")
                .setLanguage("US")
                .build();
        System.out.println("l3 = " + l3);


        l3 = new Locale.Builder()
                .setRegion("us")
                .setLanguage("EN")
                .build();
        System.out.println("l3 = " + l3);

        System.out.println("----------");

        System.out.println(Locale.getDefault());
        Locale locale1 = new Locale("fr");
        Locale.setDefault(locale1);
        System.out.println(Locale.getDefault());



    }
}
