package mianshi;

import java.util.LinkedList;

/**
 * Created by xl on 2017/10/13.
 */
public class BinTree {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            data=x;
        }
    }
    static int count =0;//计数
    static  int c =0;

    public static void main(String[] args) {
        int[]  a = {1,2,3,0,0,4,0,0,5,0,0};
        TreeNode root = createTree(a,count);
        //String res = levalTraver(root);
        StringBuilder sb = new StringBuilder();
        //inorderToSequence(sb,root);
        toSequence(sb,root);
        String res = sb.toString();
        System.out.println(sb.toString());
        //反序列化
        String[] strs = res.split("!");
        TreeNode rootNew = SequenceToTree(strs,c);

    }

    //创建一个二叉树，给的序列是按照前序遍历来创建的

    public static TreeNode createTree(int[] arr,int i){
        TreeNode root;
        if(arr.length<i||arr[i]==0){
            root=null;
        }else {
            root = new TreeNode(arr[i]);
            root.left = createTree(arr,++count);//count是用来指向数组下标
            root.right = createTree(arr,++count);//先加一再使用
        }
        return root;
    }
    //层次遍历
    public static String  levalTraver(TreeNode root){
        StringBuffer sb = new StringBuffer();
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(root);//插入队列结尾

        while (!linkedList.isEmpty()){
            TreeNode node = (TreeNode) linkedList.removeFirst();//移除并返回第一个 队首出队
            sb.append(node.data+" ");//

            if(node.left!=null){
                linkedList.addLast(node.left);
            }
            if(node.right!=null){
                linkedList.addLast(node.right);
            }

        }
        return sb.toString();
    }
    //二叉树序列化 先序遍历
    public static void  toSequence(StringBuilder sb,TreeNode root){
        if(root==null){
            sb.append("#!");
        }else {
            sb.append(root.data+"!");
            toSequence(sb,root.left);
            toSequence(sb,root.right);

        }
    }

    //二叉树序列化，中序遍历
    public static void inorderToSequence(StringBuilder sb,TreeNode root){
        if(root==null){
            sb.append("#!");
        }else {
            inorderToSequence(sb,root.left);
            sb.append(root.data+"!");
            inorderToSequence(sb,root.right);
        }
    }
    //二叉树序列化.后续遍历

    public static void afterToSequence(StringBuilder sb,TreeNode root){
        if(root==null){
            sb.append("#!");
        }else {
            afterToSequence(sb,root.left);
            afterToSequence(sb,root.right);
            sb.append(root.data+"!");
        }

    }

    //反序列化 先序 就是创建二叉树
    public static TreeNode SequenceToTree(String[] strs,int i){

        TreeNode root ;
        if(strs[i].equals("#")||strs.length<i){
            root = null;
        }else {
            root = new TreeNode(Integer.parseInt(strs[i]));
            root.left = SequenceToTree(strs,++c);
            root.right = SequenceToTree(strs,++c);

        }
        return root;

    }
    //反序列化 中序
    

}
