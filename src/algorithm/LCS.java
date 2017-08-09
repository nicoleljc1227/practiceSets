package algorithm;

/**
 * Created by xl on 2017/7/10.
 * 算法：最长公共子序列
 * 在已知前一个状态子序列长度的情况下，判断
 */
public class LCS {
    public static void main(String[] args) {
        String str1 = "cnblogs";
        String str2 = "belong";
        System.out.println(LongestCS(str1,str2));

    }
    public static int LongestCS(String str1,String str2){
        int n1 = str1.length();
        int n2 = str2.length();
        int[][] result = new int[n1+1][n2+1];//存储中间状态，当前长度
        for (int i = 0; i <=n1 ; i++) {
            for (int j = 0; j <=n2 ; j++) {
                //第一行和第一列
                if(i==0||j==0){
                    result[i][j] = 0;
                }else if(str1.charAt(i-1) == str2.charAt(j-1)){//前一个状态不相等就要重新开始
                    //这里判断的是i-1状态 2个子序列最后一个元素是否相同 i,j保存的是i-1 j-1的子序列长度 而且数组行列从1开始
                    result[i][j] = result[i-1][j-1]+1;
                }else {
                    result[i][j] = Math.max(result[i-1][j],result[i][j-1]);
                }
            }
        }
        return result[n1][n2];
    }
}
