package zhenti2017.didi;

import java.util.Scanner;

/**
 * Created by xl on 2017/8/26.
 */
public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int[] num = new int[strs.length];
            for (int i = 0; i <strs.length ; i++) {
                num[i] = Integer.parseInt(strs[i]);
            }

            System.out.println(fun(num, num.length));

        }
    }

    public static int fun(int[] num,int n){
        int sum = 0, flag = -10000000;

        for (int i = 0; i <num.length ; i++) {
            sum = 0;
            for (int j = i; j <num.length ; j++) {
                sum+=num[j];
                if(sum>flag){
                    flag = sum;
                }
            }
        }

        return flag;

    }


   /* int max=-0x80000000;
    int sum=0;
		for(int i=0;i<arr.length;i++){
        sum=0;
        for(int j=i;j<arr.length;j++){
            sum+=arr[j];
            if(sum>max) max=sum;
        }
    }
		return max;
*/
}


