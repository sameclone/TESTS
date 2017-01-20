package OCJP8.chap5;

/**
 * Created by yevgeniya.zuyeva on 20.01.2017.
 */
public class TestsString {


    public static void main(String[] args) {
        String s1 = "bunny";
        String s2 = "bunny";
        String s3 = new String("bunny");

        System.out.println("s1==s2 = " + (s1 == s2));
        System.out.println("s1==s3 = " + (s1 == s3));
        System.out.println("s1.equals(s3) = " + s1.equals(s3));

        System.out.println("---------------");

        String s4 = "1" + 2 + 3;
        String s5 = 1 + 2 + "3";
        System.out.println(s4);
        System.out.println(s5);

        System.out.println("---------------");

        String s = "abcde";
        System.out.println(s);
        System.out.println("length=" + s.trim().length());
        System.out.println("Char at 4 = " + s.charAt(4));
        System.out.println("Index of e=" + s.indexOf('e'));
        System.out.println("Index of de=" + s.indexOf("de"));
        System.out.println("Substring 2-4->UpperCase="+s.substring(2, 4).toUpperCase());
        System.out.println(s);
        System.out.println("Replace a->1="+s.replace('a','1'));
        System.out.println(s);
        System.out.println("s contains DE="+s.contains("DE"));
        System.out.println("s starts with a ="+s.startsWith("a"));

        System.out.println("---------------");

        StringBuilder b = new StringBuilder();
        System.out.println("b: "+b);
        b.append(12345).append('-');
        System.out.println("b: "+b);
        System.out.println("length="+b.length());
        System.out.println("index of ="+b.indexOf("-"));
        System.out.println("char at 2 ="+b.charAt(2));

        StringBuilder b2 = b.reverse();
        System.out.println("b: "+b);
        System.out.println("b2: "+b2);
        System.out.println(b==b2);

        System.out.println("---------------");

        StringBuilder s6 = new StringBuilder("abcde");
        System.out.println(s6);
        s6.insert(1,'-').delete(3,4);
        System.out.println(s6);
        System.out.println(s.substring(2,4));



    }
}
