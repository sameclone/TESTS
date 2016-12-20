package whiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yevgeniya.zuyeva on 25.11.2016.
 */
public class Tester1Q49 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(new Integer[]{3,4,5,6,7,8,9});
       // HashMap<Integer,List<Integer>> map = list.stream().collect(Collectors.groupingByConcurrent( ( Integer in)->{return in%2==0;}));
    }
}
