package Queue;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Deque;
public class Queue_Test {
    public static void main(String[] args) {
        //Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("LKY");
        queue.add("DJLFGJOLP");
        queue.offer("JMSKLF0");

        //获取对头元素
        System.out.println(queue.element());
        System.out.println(queue.peek());

        //获取队头元素并删除
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        //优先级队列
        Queue<User> q= new PriorityQueue<>();
        q.add(new User("LKY","A10"));
        q.add(new User("LKs","A2"));
        q.add(new User("Bob","V1"));

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());


        //Deque
       Deque<String> deq = new LinkedList<>();
       deq.addFirst("A");
        deq.addFirst("B");
        deq.addLast("C");
        //B->A->C
        System.out.println(deq.pollFirst()); //B
        System.out.println(deq.pollLast());//C
        System.out.println(deq.pollFirst());//A
        System.out.println(deq.pollLast());

    }

}
