package zhenti2017.wangyi;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by xl on 2017/6/16.
 */
public class num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] number = new int[n];
            for (int i = 0; i <n ; i++) {
                number[i] = sc.nextInt();
            }
            LinkedList list = new LinkedList();


            for (int i = 0; i <n ; i++) {
                list.addLast(number[i]);
                Collections.reverse(list);
            }
            for (int i = 0; i <list.size() ; i++) {
                if(i!=list.size()-1){
                    System.out.print(list.get(i)+" ");
                }else {
                    System.out.print(list.get(i));
                }
            }

        }
    }
}
