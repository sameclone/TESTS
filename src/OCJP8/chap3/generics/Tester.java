package OCJP8.chap3.generics;

import OCJP8.chap2.factory.Fish;
import OCJP8.chap2.factory.Pellets;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class Tester {
    public static void main(String[] args){
        Fish fish = new Fish(10);
        Crate<Fish> crateForFish = new Crate<>();
        crateForFish.packCrate(fish);
        Fish newFish = crateForFish.emptyCrate();

        Pellets pellets = new Pellets(10);
       // crateForFish.packCrate(pellets); //compile error
        Crate<Pellets> crateForPellets = new Crate<>();
        crateForPellets.packCrate(pellets);
        Pellets pellets1 = crateForPellets.emptyCrate();


        SizeLimitedCrate<Fish,Integer> sizeLimitedCrate= new SizeLimitedCrate<>(fish, 10); //autoboxing

    }

}
