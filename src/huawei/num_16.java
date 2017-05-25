package huawei;

import java.util.*;

/**
 * 王强今天很开心，公司发给N元的年终奖。王强决定把年终奖用于购物，
 * 他把想买的物品分为两类：主件与附件，附件是从属于某个主件的，下表就是一些主件与附件的例子：
 */
public class num_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N,m;
            N = sc.nextInt();
            m = sc.nextInt();
            int row = m+1;
            int col = N/10+1;
            int[] prices = new int[m];
            int[] levels = new int[m];
            int[] flags = new int[m];
            int[][] value = new int[row][col];
            for (int i = 0; i <m ; i++) {
                int price = sc.nextInt();
                int level = sc.nextInt();
                int flag = sc.nextInt();
                prices[i] = price;
                levels[i] = level;
                flags[i] = flag;
            }
            for (int i = 0; i <row ; i++) {
                value[row][0] = 0;
            }
            for (int i = 0; i <col ; i++) {
                value[0][col] = 0;
            }
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < col ; j++) {
                    if (flags[i-1]==0&&prices[i-1]<=j*10){
                        value[i][j] = Math.max(value[i-1][j],levels[i-1]+ value[i-1][prices[i-1]-j*10]);//上一行的值，放入当
                    }
                    if ((flags[i-1]==0||flags[i-1]==1)&&prices[i-1]<=j*10){//前面有主件且附件个数小于等于2
                        value[i][j] = Math.max(value[i-1][j],levels[i-1]+ value[i-1][prices[i-1]-j*10]);//上一行的值，放入当
                    }else{
                        value[i][j] = value[i][j-1];
                    }

                }
            }



        }
    }

}
