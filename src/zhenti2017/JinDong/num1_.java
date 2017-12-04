package zhenti2017.JinDong;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/16.
 */
public class num1_ {

    private static final int MAX = 1000000007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long ans = 1;

        for (int b = 2; b <= N; b++) {
            for (int i = 1; i <= (int)Math.sqrt(b); i++) {
                if (b % i == 0) {
                    ans = (ans + 2) % MAX;
                }
            }
        }

        System.out.println(ans * N % MAX);

    }
}
