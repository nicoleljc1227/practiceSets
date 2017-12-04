package zhenti2017.card51;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/18.
 */
public class num3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int Max = 100007;
        int[][] res = new int[Max][2];
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] s1 = str1.split(" ");
        String[] s2 = str2.split(" ");


        int[] veto = new int[s1.length];
        for (int i = 0; i < veto.length; ++i){
            veto[i] = Integer.valueOf(s1[i]);
        }
        int[] weight = new int[s2.length];
        for (int i = 0; i < weight.length; ++i){
            weight[i] = Integer.valueOf(s2[i]);
        }
        for(int i = 0; i <veto.length; ++i){
            res[veto[i] - 1][0] += weight[i] ;
            res[veto[i] - 1][1]++;
        }
        int index = -1;
        int max = -1;
        int flag = 0;
        for(int i = 0; i < res.length; ++i){
            if (res[i][0] > max){
                index = i;
                max = res[i][0];
                flag = res[i][1];
            }
            else if(res[i][0] == max){
                if (res[i][1] > flag){
                    flag= res[i][1];
                    index = i;
                }
            }
        }
        System.out.println(index + 1);
    }
}
