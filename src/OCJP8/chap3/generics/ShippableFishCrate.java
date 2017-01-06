package OCJP8.chap3.generics;

import OCJP8.chap2.factory.Fish;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class ShippableFishCrate implements Shipable<Fish> {
    @Override
    public void ship(Fish fish) {
        System.out.println("Shipping fish...only");
    }
}
