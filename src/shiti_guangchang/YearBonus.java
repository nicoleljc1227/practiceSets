package shiti_guangchang;

/**
 * Created by xl on 2017/7/10.
 * 年终奖
 * 就是不知道格子里放到价值的位置，所以用动态规划，将每一种走法的值记录下来
 * 每一个格子存储到大这个格子之前获得的最大价值
 * 第一列的格子，到达它时只能从上走
 * 第一行格子，到达时 只能从左边走
 */
public class YearBonus {
    public static void main(String[] args) {
        int[][] value = new int[6][6];
        value[0][0] =102;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                value[i][j] = 6+value[0][0]+i+j;
            }
        }
        int[][] dp = new int[7][7];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <=6 ; j++) {
                if(i==1){
                    dp[i][j] = dp[i][j-1]+value[i-1][j-1];
                }
                if(j==1&&i!=1){
                    dp[i][j] = dp[i-1][j]+value[i-1][j-1];
                }
                if(i>1&&j>1){
                    dp[i][j] = Math.max(dp[i-1][j]+value[i-1][j-1],dp[i][j-1]+value[i-1][j-1]);
                }
            }

        }
        System.out.println(dp[6][6]);
    }
}
