package collectionsexamples;

/**
 * Created by yevgeniya.zuyeva on 26.12.2016.
 */
public abstract class Animal {
    void eat(){
        System.out.println("Animal is eating....");
    }
}

class Dog extends Animal{
    void bark(){};
}

class Cat extends Animal{
    void meow(){}
}
