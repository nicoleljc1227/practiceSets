package huawei;

import java.util.*;

/**
 * Created by xl on 2017/4/11.
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 9876673
 */
public class num_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            String str = String.valueOf(num);
            List<Character> set = new ArrayList<>();
            char[] arr = str.toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                if (!set.contains(arr[i])) {
                    set.add(arr[i]);
                }//
            }
            for (Character e : set) {
                System.out.print(e);
            }
        }
    }

}
