package OCJP8.chap7;

/**
 * Created by yevgeniya.zuyeva on 01.02.2017.
 */
public class PrintData implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<3; i++){
            System.out.println("Printing record: "+i);
        }
    }

    public static void main(String[] args){
        new Thread(new PrintData()).start();
    }
}
