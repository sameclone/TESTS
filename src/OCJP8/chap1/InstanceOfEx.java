package OCJP8.chap1;

/**
 * Created by yevgeniya.zuyeva on 29.12.2016.
 */
public class InstanceOfEx {
    public static void main(String[] args){
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;//true
        boolean b2 = hippo instanceof HeavyAnimal;//true
        boolean b3 = hippo instanceof Elephant;//false

        boolean b4 = hippo instanceof Object; //true
        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object; //false

        Hippo anotherHippo = new Hippo();
       // boolean b6 = anotherHippo instanceof Elephant;//Does not compile!!!!


         boolean b7 = anotherHippo instanceof Mother;//Compile!!!!

        System.out.println(b1+" "+b2+" "+b3+" "+b4+" "+b5+" "+b7);
    }

}
class HeavyAnimal{}
class Hippo extends HeavyAnimal{}
class Elephant extends HeavyAnimal{}
interface Mother{}