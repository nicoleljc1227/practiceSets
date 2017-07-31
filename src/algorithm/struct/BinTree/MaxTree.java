package algorithm.struct.BinTree;

/**
 * Created by xl on 2017/7/31.
 * 构造MaxTree 牛客在线编程
 */
public class MaxTree {
    public static void main(String[] args) {
        int[] arr = {2049,933,1444,1695,96,1025,533};
        int[] res = buildMaxTree(arr,7);
        System.out.println(res);
    }

    public static int[] buildMaxTree(int[] A, int n) {
        // write code here
        int max_left = 0,max_right = 0,max = 0;
        int pos_left = -1;
        int pos_right = -1;
        int[] res = new int[n];
        for (int i = 0; i <n ; i++) {
            max_left = A[i];
            max_right = A[i];
            if(i!=0){
                for (int j = i-1; j >=0 ; j--) {
                    if(A[j]>max_left){
                        max_left = A[j];
                        pos_left = j;
                        break;
                    }

                }
            }else {
                max_left = -1;
            }
            if(i!=n-1){
                for (int j = i+1; j < n ; j++) {
                    if(A[j]>max_right){
                        max_right = A[j];
                        pos_right = j;
                        break;
                    }

                }
            }else {
                max_right = -1;
            }

            if((max_left==-1||max_left==A[i])&&max_right!=A[i]){
                res[i] = pos_right;
            }else if((max_right==-1||max_right==A[i])&&max_left!=A[i]){
                res[i] = pos_left;
            }else if(max_left!=A[i]&&max_right!=A[i]){
                res[i]= max_left<max_right? pos_left:pos_right;
            }else {
                res[i] = -1;
            }

        }
        return res;
    }
}
