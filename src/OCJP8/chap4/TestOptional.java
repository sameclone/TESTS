package OCJP8.chap4;

import java.util.Optional;

/**
 * Created by yevgeniya.zuyeva on 13.01.2017.
 */
public class TestOptional {

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return Optional.of((double) sum / scores.length);

    }

    public static Optional<Double> average1(int... scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return scores.length==0?Optional.empty():Optional.of((double) sum / scores.length);

    }


    public static Optional<Double> average2(int... scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return  Optional.ofNullable((double) sum / scores.length);

    }

    public static Optional<Double> average3(int... scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        Double result = scores.length==0?null:(double) sum / scores.length;

        return  Optional.ofNullable(result);

    }

    public static void main(String[] args) {

        System.out.println(average(90,100));
        System.out.println(average());

        Optional<Double> optional = average(90,100);
        if(optional.isPresent())
        {
            System.out.println(optional.get());
        }


        Optional<Double> optional1 = average();
       // System.out.println(optional1.get()); //java.util.NoSuchElementException: No value present

        System.out.println("-----");
        System.out.println(average1(90,100));
        System.out.println(average1());

        System.out.println("-----");
        System.out.println(average2(90,100));
        System.out.println(average2());

        System.out.println("-----");
        System.out.println(average3(90,100));
        System.out.println(average3());

        Optional<Double> opt = average(90,100);
        opt.ifPresent(System.out::println);

        Optional<Double> opt1 = average();
        opt1.ifPresent(System.out::println);

        System.out.println("-----");

        Optional<Double> opt2 = average();
        System.out.println(opt2.orElse(Double.NaN));
        System.out.println(opt2.orElseGet(()->Math.random()));
       // System.out.println(opt2.orElseThrow(()->new IllegalStateException()));

        System.out.println("-----");

        Optional<Double> opt3 = average(90,100);
        System.out.println(opt3.orElse(Double.NaN));
        System.out.println(opt3.orElseGet(()->Math.random()));
        System.out.println(opt3.orElseThrow(()->new IllegalStateException()));


    }
}
