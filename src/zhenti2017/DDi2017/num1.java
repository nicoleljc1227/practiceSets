package zhenti2017.DDi2017;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xl on 2017/9/8.
 */
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i <n ; i++) {
                nums[i] = sc.nextInt();
            }

            Arrays.sort(nums);
            int i,j;


            for (i = 0; i < nums.length; i++) {
                for (j = i+1; j <nums.length; j++) {
                    int res = nums[i]^nums[j];
                    if(res!=0){
                        break;
                    }else {
                        res=res^nums[j];

                    }
                }
                i=0;

            }





        }
    }
}
