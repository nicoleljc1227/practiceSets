package other;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/4.输出阵列
 * 4
 1*2*3*4
 9*10*11*12
 13*14*15*16
 5*6*7*8
 */
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            squarePatternPrint(n);


        }

    }

        public static void squarePatternPrint(int n)
        {
            int[][] arr = new int[n][n];
            int head = 0;
            int end = n-1;
            int num = 1;
            for (int i = 0; i <n/2 ; i++) {
                for (int j = 0; j < n; j++) {
                    arr[head][j]= num++;//第一个num是0 第二个才是1
                }
                for (int k = 0; k < n; k++) {
                    arr[end][k] = num++;
                }
                head++;
                end--;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n ; j++) {
                    if(j!=n-1){
                        System.out.print(arr[i][j]+"*");
                    }else {
                        System.out.print(arr[i][j]);
                    }
                }
                System.out.println();

            }

        }
}
