package zhenti2017.ZhaoXinYong;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/13.
 * A,B参加比赛，给出n个同事的身高站成一排，参赛选手每次可以选择1个或者2个同事，最后计算参赛者身高的和，看看A胜利还是B胜利 假设A,B都足够聪敏
 */
public class num2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){

            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i <n ; i++) {
                nums[i] = sc.nextInt();
            }
            int sumA =0,sumB =0;
            sumA = first(nums,0,n-1);
            sumB = last(nums,0,n-1);
            if((sumA-sumB)>0){
                System.out.println("true");
            }




          /*  boolean flag = true;//A先
            int i=3;
            while (i<=n){
                if((nums[i-3]+nums[i-2])>(nums[i-1]+nums[i])){
                    i+=2;
                }
                if((nums[i-3]+nums[i])>(nums[i-2]+nums[i-1])){
                    i+=1;
                }
                if(flag){
                    sumA=nums[i-3]+nums[i-2];
                }else {


                }

            }*/



        }
    }

    //先选者获得最终的最优分数
    public static int first(int[] nums,int i,int j){
        if(i==j){
            //只有一个数
            return nums[i];
        }
        if(i+1==j)
            return nums[i]+nums[j];//当总共只有2个数 都选走
        //A选1个这A选2个的时候，递归剩下数列选出最大的
        return Math.max(nums[i]+last(nums,i+1,j),nums[i]+nums[i+1]+last(nums,i+2,j));
    }
    //作为后选者，最终的最优分数 i左边界，j右边界
    public static int last(int[] nums,int i,int j){
        if(i==j||i+1==j){//总数目只有一个数或者2个数返回0，因为A肯定把这2个选走了
            return 0;
        }
        return Math.min(first(nums,i+1,j),first(nums,i+2,j));//后选着只能拿到相对较小的分数
    }
}
