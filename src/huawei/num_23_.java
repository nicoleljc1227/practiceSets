package huawei;

import java.util.*;

/**
 * Created by xl on 2017/4/10.
 *
 */
public class num_23_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            Map<Character,List<Integer>> map = new HashMap<>();
            for (int i = 0; i <str.length(); i++) {
                if(map.containsKey(str.charAt(i))){
                    continue;
                }
                List<Integer> lists = new ArrayList<>();
                lists.add(i);
                map.put(str.charAt(i),lists);
                for (int j = i+1; j <str.length() ; j++) {
                    //要在这之前放入map
                    if(map.containsKey(str.charAt(j))){
                        lists.add(j);
                    }
                }
                //map.put(str.charAt(i),lists);在这之前lists发生变化后其实直接修改了map里的lists
            }

            StringBuffer sb = new StringBuffer();

            int min = 20;
            for(Map.Entry<Character,List<Integer>> m: map.entrySet()){
                int cur = m.getValue().size();
                if(cur<min){
                    min = cur;
                }
            }

            for (Map.Entry<Character,List<Integer>> m: map.entrySet()){
                int cur = m.getValue().size();
                if(cur>min){
                    for(Integer integer:m.getValue()){
                        //sb.setCharAt(integer,m.getKey());这里不好按照原来顺序添加
                    }
                }
            }
            System.out.println(sb);

        }
    }
}
