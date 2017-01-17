package OCJP8.chap4.streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 16.01.2017.
 */
public class TestTerminalOperations {
    public static void main(String[] args){
        //count

        Stream<String> s = Stream.of("monkey","gorilla","bonobo");
        System.out.println(s.count());

        System.out.println("----------");

        //min & max

        Stream<String> s1  = Stream.of("monkey","ape","bonobo");
        Optional<String> min = s1.min((s11,s2)->s11.length()-s2.length());
        System.out.println(min);
        min.ifPresent(System.out::println);

        Stream<String> s2  = Stream.of("monkey111","ape","bonobo");
        Optional<String> min1 = s2.min((s22,s11)->s11.length()-s22.length());
        System.out.println(min1);
        min1.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty().min((s11,s22)->0);
        System.out.println(minEmpty);
        System.out.println(minEmpty.isPresent());

        System.out.println("----------");

        //findAny && findFirst

        Stream<String> s3 = Stream.of("monkey", "gorilla","bonobo");
        Stream<String> infinite = Stream.generate(()->"chimp");
        s3.findAny().ifPresent(System.out::println);
        infinite.findFirst().ifPresent(System.out::println);

        System.out.println("----------");

        //allMatch , anyMatch, noneMatch

        List<String> list = Arrays.asList("monkey","2","chimp");
        Stream<String> infinite1 = Stream.generate(()->"chimp");
        Predicate<String> predicate = x->Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(predicate)); //true
        System.out.println(list.stream().allMatch(predicate)); //false
        System.out.println(list.stream().noneMatch(predicate)); //false
        System.out.println(infinite1.anyMatch(predicate)); //true

        System.out.println("----------");

        //forEach
        Stream<String> s4 = Stream.of("Monkey","Gorilla","Bonobo");
        s4.forEach(System.out::println);

        //Stream<Integer> s5 = Stream.of(1);
       // for(Integer i: s5){} DOES NOT COMPILE

        System.out.println("----------");

        //reduce

        //old way
        String[] array = new String[]{"B","A","D"," ","W","O","L","F"};
        String result = "";
        for (String str: array){
            result+=str;
        }
        System.out.println("Old way: "+result);

        //new way
        Stream<String> stream = Stream.of("B","A","D"," ","W","O","L","F");
        String word = stream.reduce("",(str1,c)->str1+c);
        System.out.println("New way: "+word);


        //new way
        Stream<String> stream1 = Stream.of("B","A","D"," ","W","O","L","F");
        String word1 = stream1.reduce("",String::concat);
        System.out.println("New way: "+word1);

        //multiply all

        Stream<Integer> integerStream = Stream.of(3,5,6);
        System.out.println(integerStream.reduce(1,(a,b)->a*b));

        BinaryOperator<Integer> binaryOperator = (a,b)->a*b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement  =Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3,5,6);

         Optional<Integer> fromEmpty =  empty.reduce(binaryOperator);
         System.out.println(fromEmpty);
         System.out.println(fromEmpty.isPresent());
        Optional<Integer> fromOne = oneElement.reduce(binaryOperator);
        System.out.println(fromOne);
        System.out.println(fromOne.isPresent());
        Optional<Integer> fromThree = threeElements.reduce(binaryOperator);
        System.out.println(fromThree);
        System.out.println(fromThree.isPresent());

        BinaryOperator<Integer> binaryOperator1 = (a,b)->a*b;
        Stream<Integer> integerStream1 = Stream.of(3,5,6);
        System.out.println(integerStream1.reduce(1,binaryOperator1,binaryOperator1));

        System.out.println("----------");

        //collect

        Stream<String> stream2 = Stream.of("B","A","D"," ","W","O","L","F");
        StringBuilder word2 = stream2.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word2);

        Stream<String> stream3 = Stream.of("B","A","D"," ","W","O","L","F");
        TreeSet<String> set = stream3.collect(TreeSet::new,TreeSet::add,TreeSet::addAll);
        System.out.println(set);

        Stream<String> stream4 = Stream.of("B","A","D"," ","W","O","L","F");
        TreeSet<String> set1 = stream4.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set1);

        Stream<String> stream5 = Stream.of("B","A","D"," ","W","O","L","F");
        Set<String> set2 = stream5.collect(Collectors.toSet());
        System.out.println(set2);






    }
}
