package OCJP8.chap7.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 07.02.2017.
 */
public class StreamsTest3 {
    public static void main(String[] args){
       List<Integer> data = Collections.synchronizedList(new ArrayList<>());
      //  List<Integer> data = new ArrayList();
        Arrays.asList(1,2,3,4,5,6).parallelStream()
                .map(i->{data.add(i);return i;}) //AVOID STATEFUL LAMBDA EXPRESSIONS
                .forEachOrdered(i->System.out.print(i+" "));
        System.out.println();

        for(Integer in: data){
            System.out.print(in+" ");
        }
    }
}
