package CoreClass.src.Unchanged_Class;

public class Record {
    public static void main(String[] args) {
        //不变类
        Point p = Point.of(2,3);
        System.out.println(p);
        Point pp = new Point(2,3);
        System.out.println(pp.equals(p)); //equals被覆写为比较数值
        Point ppp = Point.of(-1,3); //构造检查报错
    }
}
