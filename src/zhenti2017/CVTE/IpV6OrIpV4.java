package zhenti2017.CVTE;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/11.
 */
public class IpV6OrIpV4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

    }

    public static boolean IpV4(String str){
        String[] chars = str.split("\\.");
        if(chars.length<4){
            return false;
        }
        for (int i = 0; i <chars.length ; i++) {
            if(!chars[i].matches("\\d{1,3}")){
                return false;
            }
            int temp = Integer.parseInt(chars[i]);
            if(temp>=0&&temp<=255){
                continue;
            }else {
                return false;
            }
        }
        return false;


    }
}
