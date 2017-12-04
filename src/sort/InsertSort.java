package sort;

/**
 * Created by xl on 2017/10/7.
 *
 */
public class InsertSort {
    public static void main(String[] args) {

        int[] arr = {5,3,8,6,4};
        insertSort(arr);
        System.out.println();
    }

    public static void insertSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int target = arr[i];//待插入
            int j = i;
            while (j>0&&target<arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            //插入
            arr[j] = target;

        }
    }

}
