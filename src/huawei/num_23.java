package huawei;


import java.util.Scanner;

/**
 * Created by xl on 2017/4/10.
 *
 */
public class num_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int[] count = new int[26];//每个元素为0，按照字母顺序存下标表示该字母的个数
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i)-'a']++;
            }
            int min=20;
            for (int i = 0; i < 26 ; i++) {
                if(count[i]<min&&count[i]>0){
                    min = count[i];
                }
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i <str.length(); i++) {
                if(count[str.charAt(i)-'a']>min){
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb);

        }
    }
}
