package zhenti2017.lianjia;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by xl on 2017/6/16.
 */
public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] nums = new int[N];

            for (int i = 0; i <N; i++) {
                nums[i] = sc.nextInt();
            }
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i <nums.length ; i++) {
                treeSet.add(nums[i]);
            }




        }
    }
}
