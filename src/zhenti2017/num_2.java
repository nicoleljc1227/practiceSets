package zhenti2017;

import java.util.Scanner;

/**
 * Created by xl on 2017/8/9.
 * 地牢逃脱BFS
 */
public class num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer it = new Integer(1);
        String str = new String();
        while (sc.hasNext()){
             int n = sc.nextInt();//行
            int m = sc.nextInt();//列
            String [][] arr = new String[n][m];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    arr[i][j] = sc.next();
                }
            }
            int step = sc.nextInt();


        }
    }
}
