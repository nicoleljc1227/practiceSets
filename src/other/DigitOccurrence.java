package other;

import java.math.BigInteger;

/**
 * Created by xl on 2017/6/4.
 */
public class DigitOccurrence {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 616263266;
        System.out.println(findDigitOccurrence(num1, num2));

    }

    public static int findDigitOccurrence(int num1, int num2) {
        int count = 0;
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        char[] ch = str2.toCharArray();
        char[] ch1 = str1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch1[0] == ch[i]) {
                count++;
            }
        }
        return count;

        // INSERT YOUR CODE HERE

    }
}

