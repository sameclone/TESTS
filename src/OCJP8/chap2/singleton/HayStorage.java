package OCJP8.chap2.singleton;

/**
 * Created by yevgeniya.zuyeva on 05.01.2017.
 */
public class HayStorage {
    private int quantity = 0;
    private HayStorage(){}

    private static final HayStorage instance = new HayStorage();

    public static HayStorage getInstance(){
        return instance;
    }

    public synchronized void addHay(int amount){
        System.out.println("Adding "+amount);
        quantity+=amount;
    }

    public synchronized boolean removeHay(int amount){
        if(quantity<amount){
            System.out.println("Not enough hay!!! total:"+getQuantity()+". needed: "+amount);
            return false;}
        System.out.println("Substracting "+amount);
        quantity-=amount;
        return true;
    }

    public synchronized int getQuantity(){
        return quantity;
    }
}
