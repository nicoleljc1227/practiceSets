package zhenti2017.card51;

import java.util.*;

/**
 * Created by xl on 2017/9/18.
 */
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


        String[] s1 = str1.split(" ");
        String[] s2 = str2.split(" ");

        int[] votes = new int[s1.length];
        int[] weight = new int[s2.length];


        for (int i = 0; i < s1.length; ++i){
            votes[i] = Integer.valueOf(s1[i]);
        }
        for (int i = 0; i < s2.length; ++i){
            weight[i] = Integer.valueOf(s2[i]);
        }


        Map<Integer,Integer> mapC = new HashMap<>();
        Map<Integer,List<Integer>> mapW= new HashMap<>();
        int count=0;
        for (int i = 1; i <s1.length ; i++) {
            if(mapC.containsKey(votes[i])){
                mapC.put(votes[i],count++);
                mapW.get(votes[i]).add(weight[i]);

            }else {
               mapC.put(votes[i],1);
               List<Integer> list = new ArrayList<>();
               list.add(weight[i]);
               mapW.put(votes[i],list);
            }
        }


        Map<Integer,Integer> mapWW= new HashMap<>();
        for (Map.Entry entry:mapW.entrySet()){
            int sum = 0;
            List<Integer> list = (List<Integer>) entry.getValue();
            for(Integer e:list){
                sum+=e;
            }
            mapWW.put((Integer) entry.getKey(),sum);

        }

        /*for (Map.Entry entry:mapWW.entrySet()){
            if()
        }*/


    }
}
