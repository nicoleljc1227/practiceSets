package jzoffer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by xl on 2017/8/28.
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分
 *
 * 1. 可以新建一个数组
 * 2. 不新建数组
 */

public class num_13 {

    public static void main(String[] args) {

        int arr[] = {1,4,3,6,8,7};
        reOrderArray(arr);
        System.out.println();

    }
    //不新建数组
    public static void reOrderArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j >i; j--) {
                if((array[j]&1)==1&&(array[j-1]&1)==0){//前偶后奇就交换
                    swap(array,j,j-1);
                }
            }
        }

        
    }

    //交换数组元素
    public static void swap(int[] array,int a,int b){
        int A = array[a];
        int B = array[b];
        array[a] = B;
        array[b] = A;

    }

}
