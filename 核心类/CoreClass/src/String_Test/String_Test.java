package CoreClass.src.String_Test;
import java.util.*;
public class String_Test {
    public static void main(String[] args) {
        String s = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s);
        String ss = "hello";

        //比较
        System.out.println(s==ss);
        System.out.println(s.equals(ss));

        //
        System.out.println(s.indexOf('l'));
        System.out.println(s.lastIndexOf('l'));
        System.out.println(s.startsWith("he"));
        System.out.println(s.endsWith("o"));
        System.out.println(s.endsWith("l"));

        System.out.println(s.isBlank());
        System.out.println(" \n\t".isBlank());
        System.out.println(s.isEmpty());

        //类型转化
        //String->char
        char[] c = s.toCharArray();

        //char->String
        char[] cc = new char[]{'w','o','r','l','d'};
        String sss = new String(cc);
        System.out.println(sss);


        //数据类型->String
        System.out.println(String.valueOf(100));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(200.0));
        System.out.println(String.valueOf('c'));
        System.out.println(String.valueOf(cc));
        System.out.println(String.valueOf(new Person("LKY",26)));
        //System.out.println(String.valueOf(null));

        //String -> 数据类型
        System.out.println(Integer.parseInt("123"));
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Float.parseFloat("100.2"));
        System.out.println(Double.parseDouble("200.333"));
        System.out.println(Byte.parseByte("11"));
        System.out.println("hello".toCharArray());


    }

}
