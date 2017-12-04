package sort;

/**
 * Created by xl on 2017/10/8.
 * 计数排序
 */
public class CountSort {
    public static void main(String[] args) {
        int[] arr = {7,4,2,1,5,3,1,5,6,8,1,9,30};
        countSort(arr);
        System.out.println();
    }

    public static void countSort(int[] arr){
        int max = max(arr);
        int[] count = new int[max+1];
        //把待排序的数值当做数组下标，count的下标表示的就是待排序元素

        for (int i = 0; i <arr.length ; i++) {
            count[arr[i]]++;
        }

        int k=0;
        for (int i = 0; i <=max ; i++) {
            while (count[i]>0){
                arr[k++] = i;
                count[i]--;
            }
        }
    }

    public static int max(int[] arr){
        int max= arr[0];
        for (int ele:arr){
            if(ele>max){
                max = ele;
            }
        }
        return max;
    }
}
