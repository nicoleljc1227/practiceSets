package workPractice.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by xl on 2017/7/12.
 * 统计每种字符的数量,然后提取一个奇数个数的字符放在第一个回文串中心,对于每个剩下的字符,
 * 两个相同字符放在回文串左右,直接用每种字符的数量对2取余即可,如果还有剩下的单一字符都只能单独为一个回文串。
 */
public class moni_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String str = in.nextLine();
            HashMap<Character, Integer> countMap = new HashMap<>();

            for (char c : str.toCharArray()) {
                if (countMap.containsKey(c)) {
                    countMap.put(c, countMap.get(c) + 1);
                } else {
                    countMap.put(c, 1);
                }
            }
            int max = 0;

            for (Map.Entry<Character, Integer> countEntry : countMap.entrySet()) {
                if (countEntry.getValue() % 2 == 1){
                    max++;
                }
            }//制作回文  统计剩下单个字符的个数 虽然单个字符可能拿去做中心点，说明筹到一个大回文，所以落单字符个数就是最少回文数

            if (max == 0) {
                System.out.println(1);
            } else {
                System.out.println(max);
            }
        }
    }


}

