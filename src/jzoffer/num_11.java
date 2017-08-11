package jzoffer;

import java.util.Scanner;
/**
 * Created by xl on 2017/6/15.
 * 输入一个整数，输出该数转为二进制表示中1的个数。其中负数用补码表示。
 */
public class num_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int copy = n;
            int count =0;
            String num ="";
            if(n<0){
                n = Math.abs(n);
                num = Integer.toBinaryString(n);
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i <num.length() ; i++) {
                    if(num.charAt(i)=='1'){
                        sb.append('0');
                    }else {
                        sb.append('1');
                    }
                }

                num = sb.toString();
                int flag=-1;
                for (int i = 0; i <num.length() ; i++) {
                    if(num.charAt(i)!='0'){
                        flag=i;
                        break;
                    }
                }
                if(flag!=0){
                    num =num.substring(flag,num.length());
                }
                n = Integer.valueOf(num,2);//二进制转10
                n++;
                num = String.valueOf(Integer.toBinaryString(n));

            }else {
                num = Integer.toBinaryString(copy);
            }

            for (int i = 0; i <num.length() ; i++) {
                if(num.charAt(i)=='1'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }


}
