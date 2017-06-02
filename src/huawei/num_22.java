package huawei;

import javax.print.DocFlavor;
import java.util.*;

/**
 * Created by xl on 2017/5/24.
 */
public class num_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            List<String> filepaths = new ArrayList<>();
            List<String> nums = new ArrayList<>();

            String filepath = sc.next();
            filepaths.add(filepath);
            String num = sc.next();
            nums.add(num);
            int length = nums.size();
            String[] items = new String[length];
            int[] counts = new int[length];
            String str;
            String newStr;
           // String filename;
            for (int i = 0; i < length; i++) {
                String[] strs = filepaths.get(i).split("\\\\");
                str = strs[strs.length-1];
                int len = str.length();
                if(len>16){
                    str = str.substring(len-16,len-1);
                }
                newStr = str+" "+nums.get(i);
                items[i] = newStr;
            }
            HashMap<String,Integer> map = new HashMap<>();


            for (int i = 0; i < items.length; i++) {
                int count = 0;
                for (int j = 1; j <items.length ; j++) {
                    if (items[j].equals(items[i])){
                        count+=1;
                    }
                }
                if(!map.containsKey(items[i])){
                    map.put(items[i],count);
                }

            }
            for(Map.Entry<String,Integer> m: map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }







        }
    }
}
