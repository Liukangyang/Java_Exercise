package Inner_class;

public class Outer {
    private String name;
    private static String staticname="Outer";
    Outer(String name){
        this.name = name;
    }

    //内部类1：显式定义
    class Inner{
        void hello(){
            System.out.println("Hello "+Outer.this.name); //内部类隐藏有外部类实例并能够访问外部类的私有成员
        }
    }

    //内部类2：匿名类-在方法中定义匿名类
    void asyncHello(){
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println("Hello " + Outer.this.name);
            }
        };
        new Thread(r).start();
    }

    //内部类3：静态内部类
    static class StaticHello{
        void hello(){
            //System.out.println("Hello "+Outer.this.name); //静态内部类不再传入外部类实例，因此无法访问outer.this
            System.out.println("Hello "+Outer.staticname);
        }
    }


}
