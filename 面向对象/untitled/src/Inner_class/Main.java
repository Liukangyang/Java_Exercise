package Inner_class;

public class Main {
    public static void main(String[] args) {
        //1.内部类定义
        Outer out =  new Outer("www");
        Outer.Inner in = out.new Inner(); //
        in.hello();

        Outer out2=  new Outer("zzz");
        out2.asyncHello();

        Outer out3=  new Outer("ggg");
        //Outer.StaticHello in3 =out3.new StaticHello();//静态内部类不再依附于外部类的实例
        Outer.StaticHello in3 = new Outer.StaticHello();
        in3.hello();
    }
}
