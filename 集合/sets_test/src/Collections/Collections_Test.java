package Collections;
import java.util.*;
public class Collections_Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(300);list.add(200);list.add(400);list.add(100);
        //洗牌
        Collections.shuffle(list);
        for(int e:list){
            System.out.println(e);
        }

        System.out.println();
        //排序
        Collections.sort(list);
        for(int e:list){
            System.out.println(e);
        }

        System.out.println();
        //不可变集合
        List<Integer> list2 = Collections.unmodifiableList(list);
        //list2.add(600); //无法修改
        list.add(600);
        list = null; //去除引用只保留不可变集合的引用
        for(int e:list2){
            System.out.println(e);
        }



    }
}
