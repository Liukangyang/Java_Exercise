package final_test;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Gooddog();
        //dog.breed = "cat";//final成员不能被修改
        dog.age = 5;
        dog.name = "花花";
        dog.run();
    }
}
