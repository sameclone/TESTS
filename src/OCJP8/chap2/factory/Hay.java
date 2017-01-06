package OCJP8.chap2.factory;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class Hay extends Food {
    public Hay(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Hay eaten: " + getQuantity());
    }
}
