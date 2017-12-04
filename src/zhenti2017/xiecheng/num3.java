package zhenti2017.xiecheng;


import java.util.Scanner;

/**
 * Created by xl on 2017/6/16.
 */
public class num3 {
    public static void main(String[] args) {
        int n;
        int min = 1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            if (temp == min) min++;
        }
        System.out.println(min);
    }


}
