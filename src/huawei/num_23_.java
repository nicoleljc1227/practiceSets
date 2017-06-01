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
                for (int j = i+1; j <str.length() ; j++) {
                    //要在这之前放入map
                    if(map.containsKey(str.charAt(j))){
                        lists.add(j);
                    }
                }
                map.put(str.charAt(i),lists);
            }

            List<Integer> flag = new ArrayList<>();

            int min = 0;
            for(Map.Entry<Character,List<Integer>> m: map.entrySet()){
                int cur = m.getValue().size();
                if(cur<min){
                    min = cur;
                    flag = m.getValue();
                }
            }

            StringBuffer sb = new StringBuffer();

            for (int i = 0; i <str.length() ; i++) {
                if(!flag.contains(i)){
                    sb.append(str.charAt(i));
                }
            }

            System.out.println(sb);

        }
    }
}
