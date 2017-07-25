package algorithm.struct.BinTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/7/25.
 * ，给定x和y，要求他们的公共父节点，即xi（也就是 yj）。牛客
 * 正整数 1, 2, 3, ...组成了一棵无限大的二叉树 完全二叉树
 */
public class BT_num_1 {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.data = value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            List list1 = fun(x);
            List list2 = fun(y);
            int flag =0;
            //get(int index)方法返回的是一个对象Object 所以if(list1.get(i)==list2.get(j))这样子会使得 2147483647== 2147483647不相等
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j <list2.size() ; j++) {
                    int a = (int) list1.get(i);
                    int b = (int) list2.get(j);
                    if(a==b){
                        System.out.println(list1.get(i));
                        flag=1;
                        break;
                    }
                }
                if (flag==1){
                    break;
                }
            }
        }
    }

    //
    static int count=0;
//    public static TreeNode createBinTree(int x, int y) {
//        int max = x > y ? x : y;
//
//    }

    public static List  fun(int num){
        List<Integer> list = new ArrayList<>();
        list.add(num);
        while(num!=1){
            if(num%2==0){
                //左节点
                num = num/2;
                list.add(num);
            }else {
                num = (num-1)/2;
                list.add(num);
            }
        }
        //System.out.println(list);
        return list;

    }
}
