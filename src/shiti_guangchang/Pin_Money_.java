package shiti_guangchang;

import java.util.Scanner;

/**
 * Created by xl on 2017/7/6.
 * 拼凑钱币
 */
public class Pin_Money_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] coins = {1,5,10,20,50,100};
            long[] F = new long[n+1];
            F[0]=1;

            for (int i = 0; i <6 ; i++) {
                for (int j = coins[i]; j <= n; j++) {
                    F[j] = F[j]+F[j-coins[i]];
                }

            }
            long res = F[n];
            System.out.println(F[n]);


        }
    }


}
