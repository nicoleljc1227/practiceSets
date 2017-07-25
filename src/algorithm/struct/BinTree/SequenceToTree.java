package algorithm.struct.BinTree;

/**
 * Created by xl on 2017/7/25.
 * 二叉树反序列化
 */
public class SequenceToTree {
    static class TreeNode {
        String val ;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(String val) {
            this.val = val;
        }
    }

    static int count=0;

    public static TreeNode sequenceToTree(String[] arr,int i){
        TreeNode root;
        if(i>arr.length||arr[i].equals("#")){
            root = null;
        }else {
            root = new TreeNode(arr[i]);
            root.left = sequenceToTree(arr,++count);
            root.right = sequenceToTree(arr,++count);
        }
        return root;

    }


    public static void main(String[] args) {
        //给定串
        String str = "12!3!#!#!#!";
        String[] arr = str.split("!");
        TreeNode root = sequenceToTree(arr,count);




    }

}
