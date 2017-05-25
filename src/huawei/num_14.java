package huawei;

import java.util.*;

/**
 * Created by xl on 2017/4/14.
 */
public class num_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                String  s = sc.next();//这里不能用nextline()第一个字符串会变成“”不知道为啥也没输入别的
               // s = s.toLowerCase();
                list.add(s);
            }
            Collections.sort(list);
            for (String s : list){
                System.out.println(s);
            }
        }
    }
}
