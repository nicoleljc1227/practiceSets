package zhenti2017.qingting;


/**
 * Created by xl on 2017/10/13.
 * 数组中数字都大于等于0小于等于n-1现在找出哪些数字是没有在数组中出现的并输出
 */
public class num2 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,1,5,4};//n=6
        //List list = Arrays.asList(arr);
        fun(arr);
    }

    public static void fun(int[] arr){
        boolean[] booleans = new boolean[arr.length];
        for (int i = 0; i <arr.length; i++) {
            booleans[arr[i]]=true;
        }

        for (int i = 0; i <booleans.length ; i++) {
            if(!booleans[i]){
                System.out.print(i+" ");
            }
        }
    }
}
