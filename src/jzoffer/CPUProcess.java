package jzoffer;

import java.util.*;

/**
 * Created by xl on 2017/6/15.
 * 转化为0,1背包问题
 */
public class CPUProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] num = new int[n];
            int sum =0;
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
                num[i] = num[i]/1024;
                sum+=num[i];
            }
            int bin=0;
            for (int i = 0; i < n; i++) {
                bin+=num[i];
            }
            bin= bin/2;
            int[][] value = new int[n+1][bin+1];
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=bin ; j++) {
                    if(j<num[i-1]){//因为num从0开始
                        value[i][j] = value[i-1][j];//前i-1个任务的最大时间
                    }else {
                        value[i][j] = Math.max(value[i-1][j],value[i-1][j-num[i-1]]+num[i-1]);
                    }
                }
            }

            System.out.println((sum-value[n][bin])*1024);

        }
    }


}
