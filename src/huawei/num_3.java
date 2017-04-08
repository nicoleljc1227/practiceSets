package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/4/2.
 */
public class num_3 {
    private  static void sortArray(int n,int[] array){

        //int[] arrayNew  = new int[n];
        //集合
        List<Integer> listA = new ArrayList<Integer>();
        for (int i = 0; i < n ; i++) {
            if (!listA.contains(array[i])){//如果不在list中
                if (listA.size()==0){
                    listA.add(array[i]);
                }else if (listA.size()==1){
                    if (listA.get(0)>array[i]){
                        listA.add(0,array[i]);
                    }else {
                        listA.add(array[i]);
                    }
                }else {
                    for (int j = 0; j < listA.size(); j++) {


                        if (array[i]>listA.get(j) && array[i]< listA.get(j+1) ){
                            listA.add(j+1,array[i]);//插入到指定位置
                            break;//如果没找到位置就跳出，因为list是有序的
                        }
                    }
                }

            }else {
                continue;
            }
        }
    }

    //有序数组二分查找
    /*private static boolean exists(int value,int[] array){

        boolean flag = false;
        int low = 0,high = array.length-1;
        while (low<=high){
            int mid = low + (high - low)/2;
            if (value > array[mid]){
                low = mid + 1;
            }else if (value < array[mid]){
                high = mid -1;
            }else {
                flag = true;
            }
        }
        return flag;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[]  arr = new int[num];
        int cur = -1;
        for (int i = 0; i < num; i++) {
            cur = sc.nextInt();
            if (cur<=1000 && cur>=1){
                arr[i] = cur;
            }else {
                System.out.println("输入的随机数必须在1-1000之间！");
            }
        }
        sortArray(num,arr);
    }
}
