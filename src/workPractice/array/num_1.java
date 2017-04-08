package workPractice.array;

/**
 * Created by xl on 2017/1/22.
 * 给定一个数组，包含正整数和负整数 ，数组中任意连续的元素可以组成子数组，求所有子数组中 子数组和 最大是多少
 */
public class num_1 {
    public static void main(String[] args) {

        int[] array= {2,-1,6,-10,3,4,6,-5,-2,-1,3};
        gratestSum(array);
    }

    public static int gratestSum(int[] arr){

        int greatestSum = 0;
        int temp = greatestSum;
        for (int i = 0; i <arr.length ; i++) {
            temp += arr[i];

            if(temp <0){
                temp = 0;//一旦加到负数舍弃前面的和 10,-1,9
            }
            if(temp>greatestSum){
                greatestSum = temp;
            }
            if(greatestSum==0){
                //找到最大的整数
                greatestSum= arr[0];
                for (int j = 1; j < arr.length; j++) {
                    if (greatestSum<arr[j])
                        greatestSum = arr[j];
                }
            }
        }
        return greatestSum;
    }
}
