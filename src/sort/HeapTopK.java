package sort;

/**
 * Created by xl on 2017/9/26.
 */
public class HeapTopK {
    /**
     * 创建k个节点的小根堆
     * @param a
     * @param k
     * @return
     */
    public static int[] createHeap(int[] a,int k){
        int[] result = new int[k];
        for (int i = 0; i <k ; i++) {
            result[i] = a[i];
        }

        for (int i = 1; i <k ; i++) {
            int child = i;
            int parent = (i-1)/2;
            int temp = a[i];
            //当前节点的父节点比自己大
            while (parent>=0&&child!=0&&result[parent]>temp){
                result[child] = result[parent];//交换
                child = parent;
                parent = (parent-1)/2;
            }
            result[child] = temp;//如没有满足while条件则不交换，temp就是result[child]

        }
        return result;
    }

    public static void insert(int[] a,int value){
        a[0] = value;
        int parent = 0;
        while (parent<a.length){
            int lchild = 2*parent+1;
            int rchild = 2*parent+2;
            int minIndex = parent;
            if(lchild<a.length&&a[parent]>a[lchild]){
                minIndex = lchild;
            }
            if(rchild<a.length&&a[minIndex]>a[rchild]){
                minIndex = rchild;
            }
            if(minIndex==parent){
                break;
            }else {
                int temp = a[parent];
                a[parent] = a[minIndex];
                a[minIndex] = temp;
                parent = minIndex;
            }
        }
    }

    public static int[] getTopKByHeap(int[] input,int k){
        int[] heap = createHeap(input,k);
        for (int i = k; i <input.length ; i++) {
            if(input[i]>heap[0]){
                insert(heap,input[i]);
            }
        }
        return heap;
    }
}
