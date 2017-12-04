package moni;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/5.
 */
public class MoniThree3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String A = sc.nextLine();
            String B = sc.nextLine();

            int maxlen = 0;
            for(int i=0; i<=B.length()-A.length(); i++) {
                int count = 0;
                for(int j=0; j<A.length(); j++) {
                    if(A.charAt(j) == B.charAt(i+j)) {
                        count++;
                    }
                }
                maxlen = Math.max(maxlen, count);
            }
            System.out.println(A.length() - maxlen);//当字符串A所有对应位的字符都和B相等，添加的字符肯定也是对位相等，那么不相等的就是A的长度减去，A和对位匹配的字符个数


        }
    }


}
