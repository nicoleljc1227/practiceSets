package zhenti2017.lianjia;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/16.
 */
public class num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int n = sc.nextInt();
            int[] groups = new int[n];
            for (int i = 0; i <n ; i++) {
                groups[i] = sc.nextInt();
            }

            int Q = sc.nextInt();
            int[] ques = new int[Q];
            for (int i = 0; i <Q ; i++) {
                ques[i]=sc.nextInt();

            }


            int[] q = new int[n];
            for (int i = 0; i <n ; i++) {
                if(i>0){
                    q[i] = q[i-1]+groups[i];
                }else {
                    q[i] = groups[i];
                }
            }
            for (int i = 0; i < Q; i++) {
                int gnumber = 0;
                for (int j = 0; j <n ; j++) {
                    if(ques[i]<=q[j]){
                        gnumber++;
                        break;
                    }else {
                        gnumber++;
                    }
                }
                System.out.println(gnumber);
            }


        }
    }
}
