package sort;

/**
 * Created by xl on 2017/10/7.
 */
public class MerageSort {
    public static void main(String[] args) {
        int[] arr = {49,38,65,97,76,13,27};
        merageSort(arr,0,arr.length-1);

    }

    public static void merageSort(int[] arr,int i,int j){
        if(i>j){
            return;
        }
        int mid = (i+j)/2;
        merageSort(arr,i,mid);//递归排序左边
        merageSort(arr,mid+1,j);//递归排序右边
        merge(arr,i,mid,j);//合并

    }

    //合并2个有序数组
    public static void merge(int[] arr,int left,int mid,int right){
        int[] temp = new int[right-left+1];
        int i=left;//第一个数组的开始元素
        int j = mid+1;//第二个数组的开始元素
        int k=0;

        while (i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }
        while (i<=mid){
            temp[k++] = arr[i++];
        }
        while (j<=right){
            temp[k++] = arr[j++];
        }

        //最后把临时数组中 元素 覆盖到arr中对应的一段数据
        for (int l = 0; l <temp.length ; l++) {
            arr[left+l] = temp[l];
        }
    }
}
