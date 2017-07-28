package zhenti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/7/28.
 * 题目1：从整形数组中[15,20,9,6],拼出一个最大的整数并输出 962015
 */
public class DTDream_num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            List<String> list = new ArrayList<>();
            for (int i = 0; i <arr.length ; i++) {
                list.add(String.valueOf(arr[i]));
            }
            Collections.sort(list,Collections.reverseOrder());//倒序排列
            for (String s:list){
                System.out.print(s);
            }

        }
    }

}
