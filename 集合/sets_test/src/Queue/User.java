package Queue;

public class User implements Comparable<User>{
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "/" + number;
    }

    @Override
    public int compareTo(User o) {
        if(this.number.charAt(0) == o.number.charAt(0)){
            if(this.number.length()>o.number.length()){
                return 1;
            }else if(this.number.length()<o.number.length()){
                return -1;
            }else{
                return this.number.compareTo(o.number);
            }
        }
        if(this.number.charAt(0)== 'V'){
            return -1;
        }
        else if(o.number.charAt(0)=='V'){
            return 1;
        }
        //首字母不是V开头且不相同时，比较字母大小:
        return String.valueOf(this.number.charAt(0)).compareTo(String.valueOf(o.number.charAt(0)));
    }
}
