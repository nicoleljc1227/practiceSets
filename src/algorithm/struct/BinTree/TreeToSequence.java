package algorithm.struct.BinTree;

/**
 * Created by xl on 2017/7/25.
 */
public class TreeToSequence {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static String toSequence1(String str,TreeNode root) {
        // 先序遍历二叉树
        if(root==null){
            return "#!";//其实只要return “#！” 就可以了，返回的值最后在递归str+toSequence1自动加上#！而不是使用  return str+"#!"这里返回的时候会没有#！;
        }else {
            str +=root.val;
            str+="!";

            str+=toSequence1(str,root.left);
            str+=toSequence1(str,root.right);

            return str;
        }

    }

    public static void toSequence2(StringBuilder sb,TreeNode root) {
        // 先序遍历二叉树
        if(root==null){
            sb.append("");//其实只要return “#！” 就可以了，返回的值最后在递归str+toSequence1自动加上#！而不是使用  return str+"#!"这里返回的时候会没有#！;
        }else {
            sb.append("(");

            toSequence2(sb,root.left);
            toSequence2(sb,root.right);
            sb.append(")");


        }

    }

    //这里也可以用StringBuild
    public static void toSequence(StringBuilder sb, TreeNode root) {
        if (root == null) {
            sb.append("#!");
        } else {
            sb.append(root.val+"!");

            toSequence(sb, root.left);
            toSequence(sb, root.right);
        }
    }


    /**
     * 建立二叉树（2）
     */
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
        //先建立树 方便测试
        int[] arr = {12, 3, 0, 0, 0};
        TreeNode root = createTree(arr, count);

        //toSequence
       StringBuilder builder=new StringBuilder();
//        toSequence(builder, root);
//        System.out.println(builder.toString());
        String str = "";
        toSequence2(builder,root);

    }

}
