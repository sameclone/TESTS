package OCJP8.chap6;

/**
 * Created by yevgeniya.zuyeva on 31.01.2017.
 */
public class TestsAssertions {
    public static void main(String[] args){
        int numGuests = -5;

        assert numGuests>0;
        System.out.println(numGuests);
    }
}
