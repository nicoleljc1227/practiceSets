package huawei;

import java.util.Scanner;

/**
 * Created by xl on 2017/4/2.
 */
public class num_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] chs = str.toCharArray();

            StringBuffer sb = new StringBuffer();

            for (int i = 0; i <26 ; i++) {
                for (Character c:chs){
                    if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
                        if((Character.toLowerCase(c)-'a')==i){
                            sb.append(c);
                        }
                    }
                }
            }
            for (int i = 0; i < chs.length; i++) {
                if (chs[i]<'A'||chs[i]>'z'||(chs[i]>'Z'&&chs[i]<'a')){
                    sb.insert(i,chs[i]);
                }
            }
            System.out.println(sb);
        }
    }
}