package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by xl on 2018/11/8.
 */
public class TwoSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int target =sc.nextInt();
        int[] nums = new int[n];
        while (sc.hasNext()) {
            for (int i = 0; i <n ; i++) {
                nums[i]=sc.nextInt();
            }

            int[] res = twoSum(nums,target);

            System.out.println("["+ res[0]+","+res[1]+"]");
        }
    }


    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],i);
        }
    for (int i = 0; i <nums.length ; i++) {
            int element = target-nums[i];
            if(map.containsKey(element)&&map.get(element)!=i){
                return new int[]{i,map.get(element)};
            }

        }
        throw new IllegalArgumentException("no this two nums");
    }
}
