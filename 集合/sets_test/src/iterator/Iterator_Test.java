package iterator;
import java.util.*;
import java.util.Iterator;
import java.util.function.Consumer;

public class Iterator_Test {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);s.add(100);s.add(200);
        //for-each遍历
        System.out.println("for-each");
        for(Integer e:s){
            System.out.println(e);
        }

        //forEach遍历
        System.out.println("for-Each");
        s.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer e) {
                System.out.println(e);
            }
        });

        //迭代器遍历
        System.out.println("Iterator");
        for(Iterator<Integer> it = s.iterator();it.hasNext();){
            System.out.println(it.next());
        }

        //自定义集合类，并自定义Iterable和Iterator接口
        System.out.println("自定义迭代器");
        ReverseList<Integer> reverseList = new ReverseList<>();
        reverseList.add(100);reverseList.add(200);reverseList.add(300);
        //
        Iterator<Integer> ite = reverseList.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

    }
}
