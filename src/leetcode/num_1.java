package leetcode;

/**
 * Created by xl on 2017/7/22.
 * 给定一个二叉树，求它的最小深度。 最小深度是沿着从根节点到最近的叶节点的最短路径的节点数。
 * 递归思想：如果根节为空则返回。如果左子树为空
 */
public class num_1 {
   static class TreeNode{
       int data;
       TreeNode lchild;
       TreeNode rchild;
//       public TreeNode(int x){
//           data = x;
//       }
   }

    /**
     * 求最小深度，到最近叶子节点的深度
     * @param root
     * @return
     */
   public static int mindepth(TreeNode root){
       if(root==null){
           return 0;
       }
       if(root.lchild==null&&root.rchild==null){
           return 1;

       }
       if(root.lchild==null){
           return mindepth(root.rchild)+1;
       }
       if(root.rchild==null){
           return mindepth(root.lchild)+1;
       }
       return Math.min(mindepth(root.lchild),mindepth(root.rchild))+1;//如果左右孩子都在则返回最小深度加1
   }


    public static int count=0;
    /**
     * 建立树 根据前序来递归建立二叉树
     */
    public static TreeNode createTree(int[] arr,TreeNode root,int i){
        if(i<arr.length){
            if(arr[i]==0){
                //数组元素为0说明后面没有子节点了，不要挂了
                root=null;
            }else {
                //数组有元素 节点挂上去
                TreeNode lchild = new TreeNode();//把孩子节点空间先开辟
                TreeNode rchild = new TreeNode();
                root.data=arr[i];
                root.lchild = createTree(arr,lchild,++count);
                root.rchild = createTree(arr,rchild,++count);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        //先建立一个根节点
        TreeNode root = new TreeNode();
        int[]  a = {1,2,3,0,0,4,0,0,5,0,0};
        root = createTree(a,root,count);
        int depth = mindepth(root);
        System.out.println(depth);


    }

}
