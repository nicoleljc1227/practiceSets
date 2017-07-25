package algorithm.struct.BinTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/7/25.
 * 网上更简单的答案
 * ，给定x和y，要求他们的公共父节点，即xi（也就是 yj）。牛客
 * 正整数 1, 2, 3, ...组成了一棵无限大的二叉树 完全二叉树
 */
public class BT_num_1_ {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            while(x!=y){
                if(x>y){
                    x/=2;
                }else {
                    y/=2;
                }
            }
            System.out.println(x);


        }
    }
}
