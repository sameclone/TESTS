package OCJP8.chap4.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 17.01.2017.
 */
public class TestAdvancedPipeline {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Annie");
        cats.add("Ripley");
        Stream<String> stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());

        System.out.println("---------");

        Optional<Integer> optional = Optional.of(123);
        threeDigit(optional);
        Optional<Integer> optional1 = Optional.of(1);
        threeDigit(optional1);
        threeDigit1(optional);
        threeDigit1(optional1);

        System.out.println("---------");

        Optional<String> stringOptional = Optional.of("Hello, world!");
        System.out.println(stringOptional);
        Optional<Integer> integerOptional = stringOptional.map(s -> s.length());
        System.out.println(integerOptional);
        System.out.println("---------");

        //ExceptionCaseStudy.create().stream().count(); //DOES NOT COMPILE!!!!

        //try #1
        Supplier<List<String>> supplier = () -> {
            try {
                return ExceptionCaseStudy.create();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        };

        //try #2
        Supplier<List<String>> supplier1 = ExceptionCaseStudy::createSafe;


        //Optional<Integer> result = optional.flatMap(TestAdvancedPipeline::calculator);
    }


    static Optional<Integer> calculator(String s){
        return  Optional.of(s.length());
    }




    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3) {
                System.out.println(string);
            }
        }

    }


    private static void threeDigit1(Optional<Integer> optional) {
        optional.map(n -> "" + n).filter(s -> s.length() == 3).ifPresent(System.out::println);
    }
}

class ExceptionCaseStudy {
    static List<String> create() throws IOException {
        throw new IOException();
    }


    static List<String> createSafe(){
        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
