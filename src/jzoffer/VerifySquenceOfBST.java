package jzoffer;

/**
 * Created by xl on 2017/11/12.
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 使用递归
 * 已知条件：后序序列最后一个值为root；二叉搜索树左子树值都比root小，右子树值都比root大。
 1、确定root；
 2、遍历序列（除去root结点），找到第一个大于root的位置，则该位置左边为左子树，右边为右子树；
 3、遍历右子树，若发现有小于root的值，则直接返回false；
 4、分别判断左子树和右子树是否仍是二叉搜索树（即递归步骤1、2、3）。
 */
public class VerifySquenceOfBST {

    public static void main(String[] args) {
        //int[] arr = {5,7,7,8,6};//要保证元素都不重复，像这个样例，会输出true其实应该是false
        int[] arr = {5,7,4,8,6};
        System.out.println(fun(arr));
    }

    /**
     *
     * @param
     * @return
     * 根据后续遍历来创建二叉树
     */
    /*static int count=0;
    public static TreeNode createTreeByAferOrder(int[] arr,int i){
        TreeNode root = null;

    }*/

    public static boolean fun(int[] arr){
        if(arr.length==0){
            return false;
        }
        if(arr.length==1){
            return true;
        }
        return judge(arr,0,arr.length-1);

    }
    public static boolean judge(int[] arr,int start,int root){
        //这一步遍历就可以保证i之前的元素都是比root小的，所以一定满足左子树条件
        int i;
        if(start>=root){
            return true;//起始位置和root重合，说明满足搜索树条件
        }
        for (i = start; i <root ; i++) {
            if(arr[i]>arr[root]){
                break;
            }
        }
        //因此只要判断右子树，有没有比root小的
        for (int j = i+1; j <root ; j++) {
            if(arr[j]<arr[root]){
                return false;
            }
        }
        return judge(arr,start,i-1)&&judge(arr,i,root-1);
    }

}
