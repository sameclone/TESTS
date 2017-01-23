package OCJP8.chap5.localization;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * Created by yevgeniya.zuyeva on 23.01.2017.
 */
public class TestsProperyResourceBundle {

    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        printProperties(us);
        System.out.println("--------------");
        printProperties(france);
        System.out.println("--------------");
        printKeyValue();
        System.out.println("--------------");
        propertiesExample();
        System.out.println("--------------");

        ResourceBundle rb = ResourceBundle.getBundle("OCJP8.chap5.localization.resourcebundles.Tax",Locale.US);
        System.out.println(rb.getObject("tax"));
    }


    public static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));
    }

    public static void printKeyValue() {
        Locale us = new Locale("EN", "us");
        System.out.println(us);
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        Set<String> keys = rb.keySet();
        keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);
    }

    public static void propertiesExample(){
        Locale us = new Locale("EN", "us");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        Properties properties = new Properties();
        rb.keySet().stream().forEach(k->properties.put(k, rb.getString(k)));
        System.out.println(properties.getProperty("notReallyProperty"));
        System.out.println(properties.getProperty("notReallyProperty","123"));

    }
}
