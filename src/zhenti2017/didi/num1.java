package zhenti2017.didi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xl on 2017/8/26.
 */
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String strs = sc.nextLine();
            String[] arr = strs.split(" ");
            int k = sc.nextInt();
            int[] num = new int[arr.length];
            for (int i = 0; i <arr.length ; i++) {
                num[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(num);
            System.out.println(num[num.length-k]);
        }
    }
}
