package search;

/**
 * Created by xl on 2017/8/20.
 */
public class BinarySerach {
    public static void main(String[] args) {

        int srcArray[] = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};
        int res = binarySearch(srcArray,23);
        System.out.println(srcArray[res]);
    }

    //二分查找普通实现
    public static int binarySearch(int[] arr,int key){
        //假设数组已经有序
        int mid = arr.length/2;//初始mid值
        if(key==arr[mid]){
            return mid;
        }

        int start = 0;//初始
        int end = arr.length-1;//初始

        while (start<=end){
            mid = (end-start)/2 + start;
            if(key<arr[mid]){
                end = mid-1;
            }else if(key>arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    //递归实现二分查找
    public static int binarySearch_(int[] arr,int key,int start,int end){
        int mid = (end-start)/2+start;

        if(key<arr[start]||key>arr[end]||start>end){
            return -1;
        }

        if(start>=end){
            return -1;
        }else if(key>arr[mid]){
            return binarySearch_(arr,key,mid+1,end);
        }else if(key<arr[mid]){
            return binarySearch_(arr,key,start,mid-1);
        }else {
            return mid;
        }
    }

}
