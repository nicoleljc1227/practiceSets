package huawei;

import java.util.*;
/**
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 */
public class num_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int n = 0;
            int count = 0;
            while (num>0){
                n = num%2;
                if (n==1){
                    count++;
                }
                num = num/2;
            }
            System.out.println(count);
        }
    }
}
