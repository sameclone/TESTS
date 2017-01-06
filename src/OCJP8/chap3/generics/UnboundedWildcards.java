package OCJP8.chap3.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class UnboundedWildcards {
    public static void main(String[] args){
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        keywords.add("J2SE");

        printList(keywords);

    }
    public static void printList(List<?> list){
        for(Object o: list){
            System.out.println(o);
        }
    }
}
