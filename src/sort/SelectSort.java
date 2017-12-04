package sort;

/**
 * Created by xl on 2017/10/7.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,3,8,6,4};
        selectSort(arr);
        System.out.println();

    }

    public static void selectSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int min = i+1;//可以改成 min=i，最后判断min！=i,说明找到更小的了，交换之
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(arr[min]<arr[i]){
                swap(arr,i,min);
            }
        }
    }

    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }
}
