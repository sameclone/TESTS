package OCJP8.chap2.factory;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public abstract class Food {
    private int quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public abstract void consumed();
}
