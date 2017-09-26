package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by xl on 2017/8/25.
 * 输入一个整数，找到这几个数字排列最小的数，可以输入负数
 */
public class KeyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            StringBuilder sb = new StringBuilder();

            Arrays.sort(chars);

            if(chars[0]=='-'){
                sb.append('-');
                for (int i = chars.length-1; i >0 ; i--) {
                    sb.append(chars[i]);
                }
            }else {
                String s = "";
                int flag = -1;
                for (int i = 0; i <chars.length ; i++) {
                    if(chars[i]=='0'){
                        s+=chars[i];
                    }else {
                        sb.append(chars[i]);
                        flag = i;
                        break;
                    }
                }
                sb.append(s);
                for (int i = flag+1; i <chars.length ; i++) {
                    sb.append(chars[i]);
                }
            }
            System.out.println(sb);

        }

    }
}
