package OCJP8.asessmentTest;

/**
 * Created by yevgeniya.zuyeva on 28.12.2016.
 */
public class Box <T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args){
        Box<String> one = new Box<>("a string");
        Box<Integer> two = new Box<>(123);
        System.out.print(one.getValue());
        System.out.print(two.getValue());
    }
}
