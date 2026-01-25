package List;

import java.util.*;

public class Equals {
    public static void main(String[] args) {
        //测试
         List<Person>  person_list=  new ArrayList<>();
        person_list.add(new Person("aa",10));
        person_list.add(new Person("bb",20));
        person_list.add(new Person("Bob",25));
        System.out.println(person_list.contains(new Person("Bob",25))); //传入的时不同的对象


    }
}
