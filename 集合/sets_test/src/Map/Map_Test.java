package Map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Map_Test {
    public static void main(String[] args) {
        //
       Map<String,Integer> map = new HashMap<>();
       //放入键值对
        map.put("AA",90);
        map.put("BB",95);
        map.put("CC",100);

        //查找键值对
        System.out.println(map.containsKey(new String("CC")));
        System.out.println(map.containsValue(100));
        System.out.println(map.containsValue(99));

        //遍历1.
        System.out.println("遍历方式1：");
        for(String key : map.keySet()){
             int e = map.get(key);
             System.out.println("key:"+key + "value:"+e);
        }

        //遍历2.
        System.out.println("遍历方式2：");
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("key:"+entry.getKey() + "value:"+entry.getValue());
        }

    }
}
