package sort;

/**
 * Created by xl on 2017/10/7.
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5,3,8,6,4};
        bubbleSort(arr);
        System.out.println();
    }

    //从后网往前冒泡，从小到大
    public static void bubbleSort(int[] arr){
       /* for (int i = 0; i <arr.length ; i++) {
            for (int j = arr.length-1; j >i ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }*/
        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
}
