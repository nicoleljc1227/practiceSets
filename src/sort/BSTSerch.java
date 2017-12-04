package sort;

/**
 * Created by xl on 2017/10/9.
 */
public class BSTSerch {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public static void main(String[] args) {

    }


    public static int  search(TreeNode root,int key){
        while (root!=null){
            if(key<root.val){
                root = root.left;
            }else if(key>root.val){
                root = root.right;
            }else {
                return root.val;
            }
        }

        return root.val;

    }
}
