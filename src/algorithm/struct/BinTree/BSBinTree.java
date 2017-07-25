package algorithm.struct.BinTree;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Created by xl on 2017/7/25.
 * 二叉树层次遍历以及序列化
 */
public class BSBinTree {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            data=x;
        }
    }


    static int count = 0;
    public static TreeNode createTree(int[] arr, int i) {//count不能用i替换，因为递归迭代的时候i会增加也会减少，比如跳回到右根节点
        TreeNode root;

        if (arr.length < i || arr[i] == 0) {
            root = null;
        } else {
            //采纳数列表中不定义节点，所以不需要new左右节点，但是使用带参数的构造方法来new节点并设置data，反正是一定要new
            root = new TreeNode(arr[i]);//a++是先使用0再加
            //count++;
            root.left = createTree(arr, ++count);//一定要先加 否则又是从上一个元素开始
            root.right = createTree(arr, ++count);
        }
        return root;
    }


    public static void main(String[] args) {
        int[]  a = {1,2,3,0,0,4,0,0,5,0,0};
        TreeNode root = createTree(a,count);
        String res = levelTraverse(root);
        System.out.println(res);

    }

    public static String levelTraverse(TreeNode root){//使用队列
        StringBuilder sb = new StringBuilder();
        Deque deque = new ArrayDeque();
        //想到队列 肯定就是要循环输出队列里的元素
        //先放入跟节点
        if(root!=null){
            deque.add(root);
            while (deque.size()!=0){
                int len = deque.size();
                TreeNode cur = (TreeNode) deque.poll();
                sb.append(cur.data+"!");

                if (cur.left!=null){
                    deque.add(cur.left);
                }else {
                    sb.append("#!");
                }
                if(cur.right!=null){
                    deque.add(cur.right);
                }else {
                    sb.append("#!");
                }
            }
        }else {
            sb.append("#!");
        }
        return sb.toString();
    }
}
