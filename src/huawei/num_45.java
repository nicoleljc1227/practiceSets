package huawei;

import java.util.*;

/**
 * Created by xl on 2017/8/8.
 */
public class num_45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] strs = new String[n];
            for (int i = 0; i < n; i++) {
                strs[i] = sc.next();
            }
            for (int i = 0; i < n; i++) {//TreeMap默认是按照值进行排序的，而不是按照value排序
                Map<Character, Integer> treeMap = new TreeMap<>();
                int value = 26;
                int count = 0;

                for (int j = 0; j < strs[i].length(); j++) {
                    char ch = strs[i].charAt(j);
                    if(treeMap.containsKey(ch)){
                        treeMap.put(ch, treeMap.get(ch)+1);

                    }else {
                        treeMap.put(ch,1);
                    }
                }
                //将map.entrySet()转换成list
                List<Map.Entry<Character,Integer>> list = new ArrayList<>(treeMap.entrySet());

                Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                        return o2.getValue()-o1.getValue();//降序排列
                    }
                });

                for (Map.Entry<Character, Integer> entry : list) {
                    count += entry.getValue() * value;
                    value--;
                }
                System.out.println(count);
            }

        }
    }



}
