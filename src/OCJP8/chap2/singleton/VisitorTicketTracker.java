package OCJP8.chap2.singleton;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 * with lazy initialization
 */
public class VisitorTicketTracker {

    private static volatile VisitorTicketTracker instance;

    private VisitorTicketTracker() {
    }

    public static VisitorTicketTracker getInstance() {
        if (instance == null) {
            instance = new VisitorTicketTracker();//NOT Thread safe!!!
        }

        return instance;
    }

    //Thread safe there

    public static synchronized VisitorTicketTracker getInstanceThreadSafe() {
        if (instance == null) {
            instance = new VisitorTicketTracker();
        }

        return instance;
    }

    //Thread safe with double-checked locking

    public static  VisitorTicketTracker getInstanceThreadSafe2() {
        if (instance == null) {
            synchronized (VisitorTicketTracker.class) {
                if (instance == null)
                    instance = new VisitorTicketTracker();
            }
        }

        return instance;
    }
}
