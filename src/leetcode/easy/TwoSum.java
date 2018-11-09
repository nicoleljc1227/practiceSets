package leetcode.easy;

import java.util.Scanner;

/**
 * Created by xl on 2018/11/7.
 * Given nums = [2, 7, 11, 15], target = 9,
 * return [0, 1].
 *
 */
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int target =sc.nextInt();
        int[] nums = new int[n];
        while (sc.hasNext()) {
            for (int i = 0; i <n ; i++) {
                nums[i]=sc.nextInt();
            }

            int[]  res =twoSum(nums,target);
            System.out.println("["+ res[0]+","+res[1]+"]");
        }


    }

    public static int[] getRes(int a, int b, int[] nums){
        int[] res = new int[2];

        int k=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==a||nums[i]==b){
                res[k++]=i;
            }
        }
        return res;
    }

    public static int[] twoSum(int[] nums, int target) {
        //复制一份
        int[] numsCopy = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            numsCopy[i]=nums[i];
        }
        // 计数排序
        int[] count = new int[target];
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]<target){
                count[nums[i]]++;
            }
        }
        int k=0;

        for (int i = 0; i <target ; i++) {
            while(count[i]>0){
                nums[k++]=i;
                count[i]--;
            }
        }

        int m,n;
        for (m = 0,n=k-1; m <n ;) {
            if(nums[m]+nums[n]<target){
                m++;
                continue;
            }
            if (nums[m]+nums[n]>target){
                n--;
                continue;
            }
            if(nums[m]+nums[n]==target){
                break;
            }


        }
        return getRes(nums[m],nums[n],numsCopy);
    }

}
