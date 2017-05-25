package huawei;

import java.util.Scanner;

/**
 * Created by xl on 2017/4/10.
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 */
public class num_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            float num = sc.nextFloat();
            String num_str = String.valueOf(num);
            int index = num_str.indexOf('.');
            int m = num_str.charAt(index+1)-'0';
            int n = 0;
            if (m>=5){
                n = (int) (num +1);
                System.out.println(n);
            }else {
                n = (int) num;
                System.out.println(n);
            }
        }
    }
}
