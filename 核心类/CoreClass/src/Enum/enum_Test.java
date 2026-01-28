package CoreClass.src.Enum;

public class enum_Test {
    public static void main(String[] args) {
        Weekday day = Weekday.SAT;
        //
        System.out.println(day.name());
        System.out.println(day.toString());
        System.out.println(day.order);
        System.out.println(day);
        //
        switch(day){
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("work");
                break;
            case SAT:
            case SUN:
                System.out.println("relax");
                break;
            default:
                throw new RuntimeException("cannot process " + day);
        }
    }
}


enum Weekday{
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

     public final int order;
    private final String Chinese;
     private Weekday(int order,String Chinese) {
        this.order = order;
        this.Chinese = Chinese;
    }

    @Override
    public String toString() {
        return this.Chinese;
    }
}
