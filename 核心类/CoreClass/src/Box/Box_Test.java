package CoreClass.src.Box;
import java.util.*;
import java.lang.*;
public class Box_Test {
    public static void main(String[] args) {
        //int->Integer
       // Integer i =new Integer(100); // 已经弃用这种赋值方法@Deprecated(since="9", forRemoval = true)
        Integer i = Integer.valueOf(100);
        System.out.println(i.toString());

        i = 200; //i指向另一个实例化Integer对象
        System.out.println(i.toString());

        //Integer->int
        int n1 = i.intValue();
        int n2 = i; //编译器转化为i.intValue
        System.out.println("n1:"+n1+" n2:"+n2);
    }
}
