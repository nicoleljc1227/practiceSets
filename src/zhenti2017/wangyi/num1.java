package zhenti2017.wangyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by xl on 2017/6/16.
 */
public class num1 {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            Map<Character,Integer> map = new HashMap();
            for (int i = 0; i <str.length() ; i++) {
                char c = str.charAt(i);
                if(map.containsKey(c)){
                    int count = map.get(c);
                    map.put(c,count++);
                }else {
                    map.put(c,1);
                }
            }
            if(map.size()==1){
                System.out.println(1);
            }else if(map.size()==2){
                if(str.length()==2){
                    System.out.println(1);
                }else {
                    System.out.println(2);
                }
            }else {
                System.out.println(0);
            }

        }
    }
}
