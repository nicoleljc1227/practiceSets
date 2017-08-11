package jzoffer;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/15.
 */
public class num_63 {
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

}
