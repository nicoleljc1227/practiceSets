package zhenti2017.pinDD;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xl on 2017/8/1.
 */
public class num_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            int[] h = new int[n];
//            int m = sc.nextInt();
//            int[] w = new int[m];
//            for (int i = 0; i <n ; i++) {
//                h[i] = sc.nextInt();
//            }
//            for (int i = 0; i <m ; i++) {
//                w[i] = sc.nextInt();
//            }
//            Arrays.sort(w);
//            Arrays.sort(h);
//            int count = 0;
//            for (int i = m-1; i >=0 ; i--) {
//                for (int j = n-1; j >=0 ; j--) {
//                    if(w[i]>=h[j]){
//                        count++;
//                        break;
//                    }
//                }
//            }
//            System.out.println(count);

            int n, m;
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
            Integer h[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                h[i] = input.nextInt();
            }
            m = input.nextInt();
            Integer flag[] = new Integer[m];
            Integer w[] = new Integer[m];
            for (int i = 0; i < m; i++) {
                w[i] = input.nextInt();
                flag[i] = 0;
            }

            Arrays.sort(w);
            for (int i = 0; i < n; i++) {
                System.out.print(h[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < m; i++) {
                System.out.print(w[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (flag[j] == 0 && h[i] <= w[j]) {
                        flag[j] = 1;
                        break;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < m; i++) {
                if (flag[i] == 1) {
                    count++;
                }
            }

            System.out.println(count);



        }
    }

}
