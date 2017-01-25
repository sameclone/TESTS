package OCJP8.chap5.localization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by yevgeniya.zuyeva on 25.01.2017.
 */
public class TestsResourceBundle {
    public static void main(String[] args){

        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo",locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("name"));
        System.out.println(rb.getString("open"));
        System.out.println(rb.getString("visitor"));

       String format = rb.getString("helloByName");
       String formetted = MessageFormat.format(format,"Trololosh");
        System.out.println(formetted);
    }
}
