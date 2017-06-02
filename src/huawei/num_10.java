package huawei;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by xl on 2017/4/14.
 */
public class num_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            TreeSet<Character> set = new TreeSet();
            for (int i = 0; i < str.length(); i++) {
                int num = str.charAt(i);
                if (num>127||num<0){
                    continue;
                }
                if (!set.contains(str.charAt(i))){
                    set.add(str.charAt(i));
                }
            }
            System.out.println(set.size());

        }
    }
}
