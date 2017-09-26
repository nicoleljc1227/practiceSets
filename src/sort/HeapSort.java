package sort;

/**
 * Created by xl on 2017/8/1. 这里以大顶堆为例子
 * 1. 建立堆  从一个无序序列建堆的过程就是一个反复筛选的过程。若将此序列看成是一个完全二叉树，则最后一个非终端节点是n/2取底个元素
 * 2. 调整堆
 */
public class HeapSort {
    /**
     * 堆调整，除了start之外，start-end均满足大顶堆的定义
     * @param arr 待调整数组
     * @param start 起始指针
     * @param end 结束指针
     */
    public static void heapAdjust(int[] arr,int start,int end){
        int temp = arr[start]; //该子树的根节点
        for (int i = 2*start+1; i <=end ; i*=2) {
            //左右孩子节点分别为 2*i+1,2*i+2
            //选择出左右孩子较小的下标
            if(i<end&&arr[i]<arr[i+1]){//防止会越界i<end
                i++;//如果当前左孩子小于右孩子，那就将指针移动到右孩子
            }
            if(temp>=arr[i]){
                break;//已经为大顶堆，保持稳定
            }
            arr[start] = arr[i];//将子节点上移
            start = i;//下一轮筛选
        }
        arr[start] = temp;//插入正确位置
    }

    public static void heapSort(int[] arr){
        if(arr==null||arr.length==0){
            return;
        }

        //建立大顶堆
        for (int i = arr.length/2; i >=0 ; i--) {
            heapAdjust(arr,i,arr.length-1);
            
        }

        for (int i = arr.length-1; i >=0 ; i--) {
            swap(arr,0,i);

            heapAdjust(arr,0,i-1);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {49,38,65,97,76,13,27,49};
        heapSort(arr);
    }
    
    

}
