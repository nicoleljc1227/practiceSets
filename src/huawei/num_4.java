package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/4/9.
 */
public class num_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
           if (str.length()>0){
               int n = str.length() % 8;
               int m = str.length() / 8;
               int j = 0;
               for (int i = 0; i < 8-n ; i++) {
                   str+="0";
               }
               while (m >=0) {
                   System.out.println(str.substring(j, j + 8));
                   j = j + 8;
                   m--;
               }
           }
        }
        }
    }