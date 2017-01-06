package OCJP8.chap3.generics;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class ShippableAbstractCrate<U> implements Shipable<U> {
    @Override
    public void ship(U u) {

    }
}
