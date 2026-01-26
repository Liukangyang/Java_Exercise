package CoreClass.src.Get_Set;
import java.beans.*;
public class Get_Set_Test {
    public static void main(String[] args) throws Exception{
        BeanInfo bean_info = Introspector.getBeanInfo(Student.class);
        System.out.println(bean_info.getPropertyDescriptors());
        for(var pd:bean_info.getPropertyDescriptors())
        {
            System.out.println(pd.getName());
            System.out.println(" "+pd.getWriteMethod());
            System.out.println(" "+pd.getReadMethod());
        }
    }
}
