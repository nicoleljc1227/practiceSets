package huawei;

import java.util.*;

/**
 * Created by xl on 2017/4/10.
 * 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 */
public class num_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
           // Map<Integer, Integer> map = new HashMap<>();//Map是不允许重复
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if (!map.containsKey(key)){
                    map.put(key, value);
                }else {
                    for (Map.Entry me: map.entrySet()){
                       if (me.getKey().equals(key)){
                           //找到对应的key
                           int v = (int) me.getValue();
                           value += v;
                       }
                    }
                    map.put(key,value);
                }
            }
            for (Map.Entry me : map.entrySet()) {
                System.out.println(me.getKey() + " " + me.getValue());
            }
        }
    }
}
