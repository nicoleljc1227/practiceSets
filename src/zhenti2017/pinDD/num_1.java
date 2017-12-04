package zhenti2017.pinDD;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xl on 2017/8/1.
 */
public class num_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
           int flag = 0;
           int res=0;
           int res1=1,res2 = 1;
            for (int i = 0; i < n; i++) {
                if(arr[i]>0){
                    flag = i;
                    break;
                }
            }

            if(flag>=1){
                for (int i = 0; i <2 ; i++) {
                    if(arr[i]<0){
                        res1 *=arr[i];
                    }
                }
            }else {
                res1 = 0;
            }
            if(res1!=0){
                res1*= arr[n-1];
            }

            if(n-flag>=3){
                int k = 0;
                for (int i = n-1; i >=flag ; i--) {
                    if(k<3){
                        res2*=arr[i];
                        k++;
                    }
                }
            }else {
                res2 = 0;
            }
            Arrays.sort(arr);
            if(res1==0&&res2==0){
                for (int i = 0; i<3 ; i++) {
                    res*=arr[i];
                }
            }else {
                res = res1>res2?res1:res2;
            }

            System.out.println(res);


        }
    }

}
