package jzoffer;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/15.
 */
public class num_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(jumpFloor(n));
        }
    }

    public static int jumpFloor(int n){

        if(n<=2){
            return n;
        }else {
            return jumpFloor(n-1)+jumpFloor(n-2);
        }
    }

}
