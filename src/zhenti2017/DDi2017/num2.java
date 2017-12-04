package zhenti2017.DDi2017;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/8.
 */
public class num2 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            while (sc.hasNext()) {
               int N = sc.nextInt();
               //long max = 100000000;

                System.out.println(getUgly(N));


            }

    }

    public static int getUgly(int number){
            if(number==0)
                return 0;
            int[] arr = new int[number];
            int count = 1;
            arr[0] = 1;
            int index2 = 0;
            int index3 = 0;
            int index5 = 0;
            while(count<number){
                int min = min(arr[index2]*2,arr[index3]*3,arr[index5]*5);
                arr[count] = min;
                while(arr[index2]*2<=arr[count]) index2++;
                while(arr[index3]*3<=arr[count]) index3++;
                while(arr[index5]*5<=arr[count]) index5++;
                count++;
            }
            return arr[number-1];

    }
    public static int min(int a,int b,int c){
        int temp = a<b?a:b;
        return temp<c?temp:c;
    }

}
