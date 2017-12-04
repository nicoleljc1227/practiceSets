package zhenti2017.xiecheng;

import java.util.*;

/**
 * Created by xl on 2017/6/16.
 */
public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            Set<Character> set = new HashSet<>();
            StringBuilder sb =new StringBuilder();
            char[] chars = str.toCharArray();
            for (int i = 0; i <chars.length ; i++) {
                if(!set.contains(chars[i])){
                    set.add(chars[i]);
                    sb.append(chars[i]);
                }
            }
            System.out.println(sb.toString());

        }
    }
}
