package sort;

/**
 * Created by xl on 2017/8/17.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        quickSort(arr,0,arr.length-1);

    }

    //一次划分
    public static int partition(int[] arr,int left,int right){
        int pivokey = arr[left];
        int pivoPoint = left;
        while (left<right){
            while (left<right&& arr[right]>=pivokey){
                right--;
            }
            while (left<right&& arr[left]<= pivokey){
                left++;
            }
            swap(arr,left,right);//把大的交换到右边，小的交换到左边
        }
        swap(arr,pivoPoint,left);//最后把pivot交换到中间

        return left;
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int pivotPos = partition(arr,left,right);
        quickSort(arr,left,pivotPos-1);
        quickSort(arr,pivotPos+1,right);
    }


    public static void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
