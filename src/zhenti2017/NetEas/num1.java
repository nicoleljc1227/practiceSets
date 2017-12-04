package zhenti2017.NetEas;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/8.
 */
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            while (n>0){
                if(n%2==0){
                    sb.append("2");
                    n=(n-2)/2;
                }else {
                    sb.append("1");
                    n=(n-1)/2;
                }


            }
            System.out.println(sb.reverse().toString());
        }
    }
}
