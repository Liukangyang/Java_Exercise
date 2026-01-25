package List;
import java.sql.Array;
import java.util.*;

public class List_Test {
    public static void main(String[] args) {
        System.out.println("List test");
        List<Integer> l1 = List.of(1,2,3);
        //l1.add(999); //List.of方法返回的是只读list

        List<Integer> l2 = new ArrayList<>();
        l2.add(100);
        l2.add(200);
        l2.add(300);

        //遍历1：
        System.out.println("遍历方式1；");
        for(int i=0;i<l2.size();i++){
            System.out.print(l2.get(i)+",");
        }


        //遍历2：
        System.out.println();
        System.out.println("遍历方式2；");
        for(Iterator<Integer> it =l2.iterator();it.hasNext();){
            System.out.print(it.next()+","); //无需it++
        }

        //遍历3：
        System.out.println();
        System.out.println("遍历方式3；");
        for(Integer e:l2){
            System.out.print(e+",");
        }


        //list->Array
        //1.toArray
        Object [] a1 = l2.toArray();
        //2.
        Integer[] a2= l2.toArray(new Integer[3]);
        //3.
        Integer[] a3 = l2.toArray(Integer[]::new);

        //Array->list
        System.out.println();
        Integer[] a4 = {1000,2000,3000};
        List<Integer> l3 = List.of(a4); //使用of方法时传入array中不允许有null值
        for(Integer e:l3){
            System.out.print(e+",");
        }

        //contains方法
        System.out.println();
        System.out.println(l3.contains(3000));
    }
}
