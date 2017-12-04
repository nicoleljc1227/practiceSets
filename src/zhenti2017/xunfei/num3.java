package zhenti2017.xunfei;

import java.util.*;

/**
 * Created by xl on 2017/9/16.
 * 输入
 7
 22 201233
 01 204521
 23 204523
 22 204526
 01 204528
 22 204527
 01 201567
 输出
 22 201233 204526 204527
 01 204521 204528 201567
 */
public class num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();

            boolean flag = true;
            Map<String,List<String>> map = new HashMap<>();
            for (int i = 0; i <n ; i++) {
                String key = sc.next();
                String c = sc.next();
                if(map.containsKey(key)){
                    map.get(key).add(c);
                }else {
                    List<String> list = new ArrayList();
                    list.add(c);
                    map.put(key,list);
                }
            }

            for (Map.Entry entry:map.entrySet()){
                List<String> list = (List<String>) entry.getValue();
                if(list.size()>1){
                    System.out.print(entry.getKey()+" ");
                    flag = false;
                    for (String s: list){
                        if(list.lastIndexOf(s)==list.size()-1){
                            System.out.println(s);
                        }else {
                            System.out.print(s+" ");
                        }
                    }

                }

            }
            if(flag){
                System.out.println("YES");
            }

        }
    }

}
