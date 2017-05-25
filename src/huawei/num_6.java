package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/4/10.
 * num可以被因式分解，而不是被整除，且这些数是质数 偶数肯定不是质数
 * 所有质数因子
 */
public class num_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long num = sc.nextLong();
            boolean flag = true;
            List<Long> list = new ArrayList<>();
            long n = 2;
            while (num >= n) {
                if (num % n == 0) {
                    num = num/n;
                    if (n!=2){
                        for (long j = 2; j <n; j++) {//除了本身
                            if (n % j == 0) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            list.add(n);
                        }
                    }else {
                        list.add(n);
                    }
                }else {
                    n++;
                }

            }
            for (Long e : list) {
                System.out.print(e + " ");
            }
        }
    }
}
