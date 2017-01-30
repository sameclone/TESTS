package OCJP8.chap6;

/**
 * Created by yevgeniya.zuyeva on 30.01.2017.
 */
public class TurkeyCage implements AutoCloseable {
    @Override
    public void close()   {
        System.out.println("Close Cage");
    }

    public static void main(String[] args)   {

       // try(Turkey t = new Turkey()){} //Does not compile

        try(TurkeyCage cage = new TurkeyCage()){
            System.out.println("put turkey in");
        }
    }
}

class Turkey{}
