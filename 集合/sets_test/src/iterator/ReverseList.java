package iterator;
import java.util.*;

public class ReverseList <E> implements Iterable<E>{
    //封装成员
    private List<E> list = new ArrayList<>();

    //基础方法
    public boolean add(E e) {
        return list.add(e);
    }

    public E get(int i) {
        return list.get(i);
    }

    //获取迭代器
    @Override
    public Iterator<E> iterator() {
        return new ReverseIterator(list.size());
    }

    //ReverseIterator内部类实现
    class ReverseIterator implements Iterator<E>{
        int index;
        //构造
        ReverseIterator(int index){
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index>0;
        }

        @Override
        public E next() {
            return ReverseList.this.list.get(--index);
        }
    }






}
