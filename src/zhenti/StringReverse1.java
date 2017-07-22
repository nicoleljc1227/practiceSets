package zhenti;

import java.util.Scanner;

/**
 * 字符串倒置
 * Created by xl on 2017/7/22.
 * I like  beijing. 变成 beijing. like I
 */
public class StringReverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            for (int i = arr.length-1; i >=0 ; i--) {
                System.out.print(arr[i]+" ");


            }
        }
    }
}
