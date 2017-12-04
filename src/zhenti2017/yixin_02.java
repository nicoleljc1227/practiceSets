package zhenti2017;



import java.util.Scanner;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
public class yixin_02
{
    private static TreeNode currentMinNode = null;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = in.nextInt();
        }
        TreeNode root = createBST(values);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            currentMinNode = root;
            int query = in.nextInt();
            findClosest(root, query);
            System.out.println(currentMinNode.value);
        }
    }

    private static void findClosest(TreeNode root, int query) {
        // write your code here
        // suppose root is not null

        if (root != null) {

            int padding = Math.abs(root.value - query);
            int currentPadding = Math.abs(currentMinNode.value - query);

            if (padding < currentPadding) {
                currentMinNode = root;
            }

            findClosest(root.left, query);
            findClosest(root.right, query);
        }
    }


    private static TreeNode createBST(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(values[0]);
        for (int i = 1; i < values.length; i++) {
            insertNode(root, values[i]);
        }
        return root;
    }

    private static void insertNode(TreeNode root, int value) {
        if (value < root.value) {
            if (root.left == null) {
                root.left = new TreeNode(value);
            } else {
                insertNode(root.left, value);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(value);
            } else {
                insertNode(root.right, value);
            }
        }
    }
}
