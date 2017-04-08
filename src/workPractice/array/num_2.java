package workPractice.array;

/**
 * Created by xl on 2017/1/25.
 * 一个数组让数组每一个元素去除 数组第一个元素 得到的商作为被除数所在位置的新值
 */
public class num_2 {
    public static void main(String[] args) {
        int[] arr ={3,4,7,22,2,13,-3};
        int divid = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]/divid;
        }
        /*
        * 或者从后边开始 防止数组元素【0】变成1
        * for(i=arr.length-1;i>=0;i--){
        *       arr[i]=arr[i]/arr[0];
        *   }
        * */
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
