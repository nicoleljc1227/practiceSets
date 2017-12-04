package moni;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/5.
 */
public class MoniThree4 {
    public static void fun(int arr[],int max){
        int flag=0;
            for (int i = 0; i <arr.length ; i++) {
                if(i!=max){
                    int mod = 0;
                    while(i>1){
                        mod=i%2;
                        if(mod==0){
                            i = i/2;
                        }else {
                            flag=1;
                            break;
                        }
                    }
                }else {
                    continue;
                }
            }
            if(flag==0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] arr1 = new int[N];
            for (int i = 0; i <N ; i++) {
                arr[i]=sc.nextInt();
            }
            int max=-1;
            for (int i = 0; i <N ; i++) {
                if(i>-1){
                    max=i;
                }
            }
            int flag=0;
            for (int i = 0; i <N ; i++) {
                if(i!=max){
                    if(arr[max]%arr[i]!=0) {
                        flag = 1;
                        break;
                    }else {
                        flag=0;
                        arr1[i]=arr[max]/arr[i];
                    }

                }else {
                    arr1[i] = arr[i];
                }
            }
            if(flag==1){
                System.out.println("NO");
            }else {
                fun(arr1,max);
            }



        }
    }


}
