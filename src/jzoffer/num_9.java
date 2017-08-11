package jzoffer;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/15.
 */
public class num_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(jumpFloor(n));
        }
    }

    public static int jumpFloor(int n){
        if (n!=0){
            return (int) Math.pow(2,n-1);
        }else
            return 0;
    }

//    public int jumpFloor(int target){
//
//        if(target==1)
//            return 1;
//        else if (target==2)
//            return 2;
//        else
//            return jumpFloor(target-1)+jumpFloor(target-2);
//    }
//    public int JumpFloorII(int target) {
//        int result = 0;
//        if (target<=2)
//            return target;
//        else if(target==3)
//            return 4;
//        else {
//            for (int i = target;i>2;i--){
//
//                result += jumpFloor(i);
//            }
//            return result;
//        }
//    }
}
