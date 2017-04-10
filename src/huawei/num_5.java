package huawei;

import java.util.Scanner;

/**
 * Created by xl on 2017/4/9.
 * 输出16进制数输出十进制
 */
public class num_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            double num = 0;
            if (!str.equals("")){
                str = str.substring(2,str.length());
                for (int i = str.length()-1; i >= 0; i--) {
                    double n = 0;
                    if (str.charAt(i)>='A'){
                        n = str.charAt(i)-'A'+10;
                    }else {
                        n = str.charAt(i)-'0';
                    }
                    num  = num + n*Math.pow(16,(str.length()-1)-i);
                }
                System.out.println((int)num);
            }
        }
    }
}
