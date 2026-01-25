package CoreClass.src.StringBuilder_test;
import java.util.*;
public class StringBuilder_Test {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(1024);
        s.append("employee ")
        .append(100)
        .append(" hello");
        System.out.println(s.toString());

        //TODO：练习
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String ss = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(ss);
        System.out.println(ss.equals(insert) ? "测试成功" : "测试失败");

    }

    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        StringBuilder s = new StringBuilder(1024);
        s.append("INSERT INTO ")
                .append(table)
                .append(" (");
        for(int i=0;i< fields.length;i++){
            if(i<2){
                s.append(fields[i])
                        .append(", ");
            }
            else
                s.append(fields[i]);
        }
        s.append(") ")
                .append("VALUES ")
                .append("(?, ?, ?)");

        return s.toString();
    }
}
