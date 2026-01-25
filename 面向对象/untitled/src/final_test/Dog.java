package final_test;

public abstract class Dog {
    String name;
    int age;
    final String breed = "Dog";
    public final void Hi(){
        System.out.println("Wang wang!");
    }

   // public abstract final void run();  //abstract 和final不可以同时使用
    public abstract void run();


}
