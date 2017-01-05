package OCJP8.chap2.composition;

/**
 * Created by yevgeniya.zuyeva on 05.01.2017.
 */
public class Penguin {
    private final Flippers flippers;
    private final WebbedFeet webbedFeet;

    public Penguin() {
        this.flippers = new Flippers();
        this.webbedFeet = new WebbedFeet();
    }

    //delegating
    public void flap(){
        this.flippers.flap();
    }

    public void kick(){
        this.webbedFeet.kick();
    }

    public static void main(String [] args){
        Penguin penguin = new Penguin();
        penguin.kick();
        penguin.flap();
    }
}
