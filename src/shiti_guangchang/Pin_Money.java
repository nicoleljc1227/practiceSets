package shiti_guangchang;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xl on 2017/7/6.
 * 拼凑钱币
 */
public class Pin_Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(count(n));


        }
    }

    public static long count(int n){
        int[] coins= {1,5,10,20,50,100};
        long[][] dp = new long[6][n+1];
        Arrays.fill(dp[0],1);
        int m =0;
        for (int i = 1; i <coins.length; i++) {
            for (int j = 1; j <=n ; j++) {
                m = j/coins[i];
                for (int k = 0; k <=m ; k++) {
                    dp[i][j] = dp[i][j]+dp[i-1][j-k*coins[i]];
                }
            }
        }
        return dp[coins.length-1][n];

    }

}
