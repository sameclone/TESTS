package whiz;

/**
 * Created by yevgeniya.zuyeva on 13.12.2016.
 */
public class TesterBook1 {
    Integer i;
    int j;

    public static void main(String[] args){
        new TesterBook1().go();

    }

    public void go(){
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
