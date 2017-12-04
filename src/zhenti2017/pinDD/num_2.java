package zhenti2017.pinDD;

import java.util.Scanner;

/**
 * Created by xl on 2017/8/1.
 * 2个大数相乘 2个数用字符串表示，不用系统自带大数类型
 */
public class num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();


            //先把末尾连续0去掉
            int zeroCount = 0;
            while (true){
                if(str1.charAt(str1.length()-1)-'0'==0){
                    zeroCount++;
                    str1 = str1.substring(0,str1.length()-1);
                }else {
                    break;
                }
            }

            while (true){
                if(str2.charAt(str2.length()-1)-'0'==0){
                    zeroCount++;
                    str2 = str2.substring(0,str2.length()-1);
                }else {
                    break;
                }
            }

            int len1 = str1.length();
            int len2 = str2.length();
            int[] num1 = new int[len1];
            int[] num2 = new int[len2];
            int len = len1*len2+1;
            int[] result = new int[len];
            //倒置2个字符串】
            for (int i = 0; i <len1 ; i++) {
                num1[i] = str1.charAt(len1-1-i)-'0';
            }
            for (int i = 0; i <len2 ; i++) {
                num2[i] = str2.charAt(len2-1-i)-'0';
            }

            //这样子每一层的数据有进位的话 不好处理，所以用数组将每一层的数据全部放在一个数组
            for (int i = 0; i <len1; i++) {
                for (int j = 0; j <len2; j++) {
                    result[i+j] += num1[i]*num2[j];//0+1 和 1+0的值都是 1 02 20 11 这三个数刚好对应竖着乘法相加相加
                }
            }
           //处理进位
            for (int i = 0; i <len ; i++) {
                if(result[i]>9){
                    result[i+1]+=result[i]/10;//把之前的数组每一位的值判断是否是2位数
                    result[i]%=10;//只留下各位
                }
            }
            boolean flag = false;

            for (int i = len-1; i >=0 ; i--) {//逆着输出结果 第一个不为0则输出
                if(flag){
                    System.out.print(result[i]);
                }else if(result[i]!=0){
                    System.out.print(result[i]);
                    flag = true;
                }

            }
        }
    }

}
