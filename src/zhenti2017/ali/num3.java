package zhenti2017.ali;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/16.
 *d
 */
public class num3 {
    public static void main(String[] args) {
        int n;
        int len = 0, temp = 0;
        int[][] matrix = new int[1000][1000]; // 缝隙可以插即为1，不可插为0
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int j = 0;
            temp = 0;
            while (true) {
                int input = scanner.nextInt();
                if (input == 0) break;
                temp += input;
                matrix[i][temp - 1] = 1;
            }
        }

        int count = 0;
        int lowest = 9999999;
        for (int j = 0; j < temp-1; j++) {
            count = 0;
            for (int i = 0; i < temp-1; i++) {
                if (matrix[i][j] == 0) count++;
            }
            if (lowest > count) lowest = count;
        }
        System.out.println(lowest);
    }

}
