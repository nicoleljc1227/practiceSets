package zhenti2017.sfkeJi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/10/14.
 */
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] num = new int[n];
            for (int i = 0; i <n ; i++) {
                num[i] = sc.nextInt();
            }

            int max = 0;
            int m = sc.nextInt();
            for (int i = 0; i <n ; i++) {
                int temp =0;
                for (int j = i; j <(i+m) ; j++) {
                    temp+=num[j%n];
                }
                if(temp>max){
                    max = temp;
                }
            }


            System.out.println(max);
        }
        }

}
