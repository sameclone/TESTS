package OCJP8.asessmentTest;

import java.time.Duration;
import java.time.Period;

/**
 * Created by yevgeniya.zuyeva on 28.12.2016.
 */
public class Test16 {
    public static void main(String[] args){
        String d = Duration.ofDays(1).toString();
        String p = Period.ofDays(1).toString();

        boolean b1=d==p;
        boolean b2 = d.equals(p);

        System.out.println(d);
        System.out.println(p);

        System.out.println(b1 +" "+b2);
    }
}
