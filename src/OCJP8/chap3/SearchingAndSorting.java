package OCJP8.chap3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class SearchingAndSorting {
    public static void main(String[] args){
        int[] numbers = {6,9,1,8};
        Arrays.stream(numbers).forEach(a->System.out.print(a+" "));
        System.out.println();
        Arrays.sort(numbers);
        Arrays.stream(numbers).forEach(a->System.out.print(a+" "));
        System.out.println("\n"+Arrays.binarySearch(numbers,6));
        System.out.println(Arrays.binarySearch(numbers,3));

        //---List

        List<Integer> list = Arrays.asList(9,7,5,3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,3));
        System.out.println(Collections.binarySearch(list,2));
    }
}
