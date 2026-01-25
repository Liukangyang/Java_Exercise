package List;

import java.util.Objects;

public class Person {
    String name;
    int age;
    public Person(String name) {
        this.name = name;
    }

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //先判断是否为同一类型示例
        if (o instanceof Person p) {
            boolean nameEquals = false;
            {
                /*
                if (this.name == null && p.name == null) {
                    nameEquals = true;
                } else if (this.name != null) {
                    nameEquals = this.name.equals(p.name);
                }*/
                nameEquals = Objects.equals(this.name,p.name); //调用静态方法，允许两者都是空值

                return nameEquals && this.age == p.age;

            }
        }
        return false;
    }

}
