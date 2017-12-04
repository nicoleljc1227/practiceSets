package zhenti2017.ZhaoXinYong;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/13.
 */
public class num1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        int totalA = 0;
        int totalB = 0;
        boolean flag = true; // A 先
        int times = 0;
        for (int i = 0; i < n; i++) {
            if (flag) {
                totalA += heights[i];
                times++;
                if (times == 2) {
                    flag = false;
                    times = 0;
                }
            } else {
                totalB += heights[i];
                times++;
                if (times == 2) {
                    flag = true;
                    times = 0;
                }
            }
        }

        System.out.println(totalA > totalB ? "true" : "false");

    }
}
