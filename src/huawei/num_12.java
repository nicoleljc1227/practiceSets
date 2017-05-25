package huawei;

import java.util.Scanner;

/**
 * Created by xl on 2017/4/14.
 */
public class num_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            for (int i = str.length()-1; i >=0; i--) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
