package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/4/2.
 */
public class num_3 {
    private static int[] sortArray(int n, int[] array) {
        //插入排序
        for (int i = 1; i < n; i++) {
            int j = i;//j不能等于i-1否则18句j=-1数组会越界
            int target = array[i];
            while (j > 0 && array[j - 1] > target) {//注意这里不能用array[j-1]>array[i]因为后移的过程改变了数组的内容 可能a[i]对应的值在改变
                array[j] = array[j - 1];//后移
                j--;
            }
            //
            array[j] = target;
        }
        return array;
    }

    private static void deleteMuti(int n, int[] array) {
        List<Integer> listA = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (!listA.contains(array[i])) {
                listA.add(array[i]);
            }
        }
        for (int j = 0; j < listA.size(); j++) {
            System.out.println(listA.get(j));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int cur = -1;
        for (int i = 0; i < num; i++) {
            cur = sc.nextInt();
            if (cur <= 1000 && cur >= 1) {
                arr[i] = cur;
            } else {
                System.out.println("输入的随机数必须在1-1000之间！");
            }
        }
        deleteMuti(num, sortArray(num, arr));
    }
}

/*
*链接：https://www.nowcoder.com/questionTerminal/3245215fffb84b7b81285493eae92ff0
来源：牛客网

public static void main(String[] args) {        
    Scanner sc=new Scanner(System.in);        
    while(sc.hasNext()){                         
    TreeSet<Integer> set=new TreeSet<Integer>();            
    int n=sc.nextInt();           
    if(n>0){                
        for(int i=0;i<n;i++){                 
        set.add(sc.nextInt());           
    }         
  }           
    for(Integer i:set){             
        System.out.println(i);            
    }       
 }    

**
* */
