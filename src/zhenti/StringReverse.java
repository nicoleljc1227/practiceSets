package zhenti;

import java.util.Scanner;

/**
 * 字符串倒置
 * Created by xl on 2017/7/22.
 * I like  beijing. 变成 I ekil .gnijieb
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            for(String s : arr){
                StringBuffer sb = new StringBuffer();
                sb.append(s);
                System.out.print(sb.reverse());
            }
        }
    }
}
