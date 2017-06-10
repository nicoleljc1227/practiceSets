package moni;

import java.util.Scanner;

/**
 * Created by xl on 2017/6/5.
 */
public class MoniThree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String cur;
            int count = 0;
            for (int i = a; i <= b; i++) {
                cur = String.valueOf(i);
                if (magicNum(cur)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean magicNum(String str) {
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        sb.append("b");
        boolean isPrime = true;
//        int r=0;
        for (int i = 0; i < str.length(); i++) {
            sb.setCharAt(0, str.charAt(i));
            for (int j = 0; j < str.length(); j++) {
                if (i == j) {
                    continue;
                }
                sb.setCharAt(1, str.charAt(j));
                if (str.charAt(i) == '0') {
                    sb.deleteCharAt(0);
                }
                int num = Integer.valueOf(sb.toString());

                for (int k = 2; k <= Math.sqrt(num); k++) {
                    if (num % k == 0) {
                        isPrime = false;//不是素数
                        break;
                    } else {
                        isPrime = true;//第一个组合不是素数会把prime变成false ，但是后面组合可能有素数 所以是素数还要赋值为true
                    }
                }
                if (isPrime) {
                    break;
                }

            }
            if (isPrime) {
                break;
            }

        }
        return isPrime;
    }
}
