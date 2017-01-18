package OCJP8.chap4.streams;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BooleanSupplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 17.01.2017.
 */
public class TestPrimitives {
    public static void main(String[] args) {

        //with reduce
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n));
        System.out.println("---------");

        //another way
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        System.out.println(stream1.mapToInt(x -> x).sum());
        System.out.println("---------");

        //primitive
        IntStream intstream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intstream.average();
        System.out.println(avg);
        System.out.println(avg.getAsDouble());
        System.out.println("---------");

        //primitive
        //IntStream intstream2 = IntStream.of(1,2,3);
        //Optional<Double> avgg = intstream2.average(); NOT COMPILE!!!!!
        // System.out.println(avgg);
        //System.out.println("---------");

        DoubleStream empty = DoubleStream.empty();
        DoubleStream oneValue = DoubleStream.of(3.14);
        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1, 2, 3, 4, 5, 1.2);
        oneValue.forEach(System.out::println);
        System.out.println();
        varargs.forEach(System.out::println);
        System.out.println("---------");

        DoubleStream random = DoubleStream.generate(Math::random);
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(3).forEach(System.out::println);
        System.out.println();
        fractions.limit(3).forEach(System.out::println);
        System.out.println("---------");

        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        count.forEach(System.out::println);
        System.out.println("---------");

        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::println);

        System.out.println("---------");
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);
        System.out.println("---------");

        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());
        intStream.forEach(System.out::println);
        System.out.println("---------");

        IntStream stream2 = IntStream.rangeClosed(1, 10);
        OptionalDouble optionalDouble = stream2.average();
        optionalDouble.ifPresent(System.out::println);
        System.out.println(optionalDouble.getAsDouble());
        System.out.println(optionalDouble.orElseGet(() -> Double.NaN));

        System.out.println("---------");
        LongStream longs = LongStream.of(5,10);
        long sum = longs.sum();
        System.out.println(sum);

        DoubleStream doubleStream = DoubleStream.generate(()->Math.PI);
       // OptionalDouble min = doubleStream.min(); //will runs infinetely
        OptionalDouble min = doubleStream.limit(10).min();
        System.out.println(min.getAsDouble());
        System.out.println("---------");

        IntStream intStream1 = IntStream.range(1,10);
        System.out.println(range(intStream1));

        DoubleStream doubleStream1 = DoubleStream.iterate(1.0, (n)->n+10.1).limit(10);
        System.out.println(range(doubleStream1));

        //IntStream intStream2 = IntStream.empty();
       // System.out.println(range(intStream2)); //Trow RuntimeException
        System.out.println("---------");

        BooleanSupplier b1 = ()->true;
        BooleanSupplier b2=()->Math.random()>.5;
        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());




    }

    private static int range(IntStream ints){
        IntSummaryStatistics statistics = ints.summaryStatistics();
        if(statistics.getCount()==0) throw new RuntimeException();

        return statistics.getMax() - statistics.getMin();
    }

    private static double range(DoubleStream doubleStream){
        DoubleSummaryStatistics statistics = doubleStream.summaryStatistics();
        if(statistics.getCount()==0) throw new RuntimeException();

        return statistics.getMax() - statistics.getMin();
    }
}
