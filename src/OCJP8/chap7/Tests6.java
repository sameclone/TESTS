package OCJP8.chap7;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 09.02.2017.
 */
public class Tests6 {
    public static void main(String[] args){
        Stream<String> cats = Stream.of("leopard","lynx","ocelot","puma").parallel();
        Stream<String> bears = Stream.of("panda","grizzly","polar").parallel();

        ConcurrentMap<Boolean, List<String>> data = Stream.of(cats, bears)
                .flatMap(s->s)
                .collect(Collectors.groupingByConcurrent(s->!s.startsWith("p")));
        System.out.println(data.get(false).size()+" "+data.get(true).size());
    }
}
