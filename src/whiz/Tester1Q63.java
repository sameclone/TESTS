package whiz;

import java.time.Period;

/**
 * Created by yevgeniya.zuyeva on 25.11.2016.
 */
public class Tester1Q63 {
    public static void main(String[] args){
        Period p = Period.ofMonths(1);
        p = p.plusYears(2);
        p = p.withYears(1);
        System.out.println(p);
    }
}
