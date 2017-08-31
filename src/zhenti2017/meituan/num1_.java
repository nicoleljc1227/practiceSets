package zhenti2017.meituan;

/**
 * Created by xl on 2017/8/31.
 */
import java.util.Scanner;

public class num1_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] num = new int[N];
            for (int i = 0; i < N; i++) {
                num[i] = sc.nextInt();
            }
            int K = sc.nextInt();
            int ASN = count(num, 0, N, K);

            System.out.println(ASN);
        }
    }

    private static int count(int a[], int left, int right, int K) {
        int sum = 0;
        for (int i = left; i < right; i++) {
            sum += a[i];
        }
        if (sum % K == 0) {
            return right - left;
        } else if (sum == 0) {
            return 0;
        } else {
            int count1 = count(a, left + 1, right, K);
            int count2 = count(a, left, right - 1, K);
            return count1 > count2 ? count1 : count2;
        }
    }
}


