package zhenti2017.JuRen;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/11.
 * 有排好序的1-n个数字,至少还剩两个数字的时候进行一下操作,把排在第一个数字扔掉,再把新的第一个数字放到最后
 */
public class QianDao  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            arr[i]=i;
        }
        int count=n;
        while (count>=2){
            int temp = arr[2];
            for (int i = 3; i <=count&&count>2 ; i++) {
                arr[i-2] = arr[i];
            }
            if(count==2){
                arr[1] = temp;
                break;
            }else {
                count--;
                arr[count]=temp;
            }
        }
        System.out.println(arr[1]);

    }

}
