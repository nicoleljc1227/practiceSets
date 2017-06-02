package huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by xl on 2017/5/25.
 */
public class num_22_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        String filepath=sc.next();
        String num;
        while(filepath!=null&filepath.length()>1){
            num = sc.next();

            String str;
            String newStr;
            String[] strs = filepath.split("\\\\");
            str = strs[strs.length-1];
            int len = str.length();
            int count =1;
            if(len>16){
                str = str.substring(len-16,len-1);
            }
            newStr = str+" "+num;

            if(map.containsKey(newStr)){
                count+=1;
            }
            map.put(newStr,count);
            filepath = sc.next();


        }
        int n =0;
        System.out.println(map.entrySet().size()+"///////");
        for(Map.Entry<String,Integer> m:map.entrySet()){
            n++;
            if(n>(map.keySet().size()-8)){
                System.out.println(m.getKey()+" "+m.getValue());
            }

        }
    }
}
