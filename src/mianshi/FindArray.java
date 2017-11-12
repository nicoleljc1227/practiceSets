package mianshi;

import java.util.Scanner;

/**
 * Created by xl on 2017/10/13.
 */
public class FindArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                arr[i][i] = sc.nextInt();
            }
        }

        int target = sc.nextInt();
        System.out.println(find(arr,target));

    }
//从第一列开始扫且从最后一行开始扫
    public static boolean find(int[][] arr,int target){
        boolean flag = false;
        for (int i = 0,j=arr[0].length-1; j>0&&i <arr.length;) {
            if(target>arr[j][i]){
                i++;//列数加一
            }else if(target<arr[j][i]){
                j--;//行数减一
            }else {
                flag = true;
            }
        }
        return flag;
    }
}
