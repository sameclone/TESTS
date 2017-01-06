package OCJP8.chap3.generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class LowerBoundedWildcards {
    public static void main(String[] args){
        List<? super IOException> exceptions = new ArrayList<Exception>();
        //exceptions.add(new Exception()); does not compile
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());

    }
}
