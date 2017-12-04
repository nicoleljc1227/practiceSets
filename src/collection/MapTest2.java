package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xl on 2017/6/12.
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.replace("c","replace");
        map.put("b",6);
        map.put("c",6);
        map.put("d",6);//如果添加的key重复了 则mapsize不会增加，只是将value改变；了
        System.out.println(map);
        //使用原value与传入参数计算出来的结果覆盖原有的value
        map.merge("merage",6,(oldVal,param)->(Integer)oldVal+(Integer)param);
        System.out.println(map);
        //....



    }


}
