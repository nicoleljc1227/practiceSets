package moni;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/5.
 */
public class MoniThree1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
           long num;
           num = sc.nextLong();
           String str = String.valueOf(num);
           int count = 0;
           while(str.length()>1){
               str = change(str);
               count++;
           }

            System.out.println(count);

        }
    }

    public static String change(String n){

        char[] ch = n.toCharArray();
        long res = 1;
        for (Character c : ch){
            int cur = c-'0';//字符可以直接赋给整型,值是ascll码 使用valueOf也是得到ascll码
            res*=cur;
        }
        return String.valueOf(res);
    }
}
