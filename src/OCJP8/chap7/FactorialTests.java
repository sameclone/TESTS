package OCJP8.chap7;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Created by yevgeniya.zuyeva on 08.02.2017.
 */
public class FactorialTests {
    public static void main(String[] args){

        for (int i=1; i<=5;i++){
            System.out.println("factorial of "+i+" = "+factorial(i));
        }

    }

    public static int factorial(int n){
        if(n<=1) return 1;
        else return n*factorial(n-1);
    }
}
