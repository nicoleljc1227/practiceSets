package shiti_guangchang;

import java.util.Scanner;

/**
 * Created by xl on 2017/7/6.
 * 最大矩形面积，分治法
 * 或者直接循环 穷举计算
 */
public class max_rectange_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            System.out.println(fun(0,array.length-1,array));
        }
    }
//高度最小的作为分界线
    public static int fun(int start,int end,int[] arr){
        int min_pos = min_pos(start,end,arr);
        int value1 = arr[min_pos]*(end-start+1);
        int value2,value3;
        if(min_pos!=start){
            value2 = fun(start,min_pos-1,arr);
        }else {
            value2 =0;//如何是左边第一个方条最小，那么第0个方条左边没有方条了所以value2位0

        }
        if(min_pos!=end){
            value3 = fun(min_pos+1,end,arr);

        }else {
            //到大最右边了，没有方条了
            value3 = 0;
        }
        int max = (value1>value2)? value1:value2;
        max = (max>value3)? max:value3;
        return max;
    }

    public static int min_pos(int i,int j,int[] arr){
        int min_pos=-1;
        int min = 1000000;
        for (int k = i; k <= j; k++) {
            if(arr[k]<min){
                min = arr[k];
                min_pos = k;
            }
        }
        return min_pos;
    }



}
