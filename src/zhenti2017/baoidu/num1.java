package zhenti2017.baoidu;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/27.
 */
public class num1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] s = str1.split("=");
        String[] s2 = str2.split("=");


        int len = Integer.valueOf(s[1]);
        String str = s2[1];

        System.out.println(getLength(len,str));
    }
    public static int getLength(int len, String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        int start = 0;
        int end = 0;
        for (int i = 0; i < stringBuilder.length(); ++i){
            if (i != stringBuilder.length() - 2){
                if (stringBuilder.charAt(i) != stringBuilder.charAt(i + 1)){
                    start = i + 1;
                    break;
                }
            }
            else{
                return 0;
            }
        }
        for (int i = stringBuilder.length() - 1; i >= 0; --i){
            if (i != 1){
                if (stringBuilder.charAt(i) != stringBuilder.charAt(i - 1)){
                    start = i - 1;
                    break;
                }
            }
            else{
                return 0;
            }
        }
        if (start == end){
            return 1;
        }
        int max = 0;
        int len1 = 0;
        for (int i = 0; i <= end; ++i){
            if (stringBuilder.charAt(i) == stringBuilder.charAt(i + 1)){
                len1++;
            }
            else{
                if (len1 > max) {
                    max = len1;
                    len1 = 0;
                }
            }
        }
        return max;
    }

}
