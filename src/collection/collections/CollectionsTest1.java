package collection.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by xl on 2017/8/27.
 * Collections工具类提供一系列方法对List集合进行排序
 */
public class CollectionsTest1 {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);
        //Collections.reverse(nums);//逆序元素
        //Collections.sort(nums);//自然顺序排序
        //Collections.shuffle(nums);//将list几个元素按照随机顺序排序
        Collections.swap(nums,2,3);//将集合中2处的元素和3处的元素进行交换
        System.out.println(nums);
        Collections.rotate(nums,2);//当distance为正数的时候将集合中的后2个元素整体移到前面，当distance为负数的时候将集合的前2个元素整体移动的后面
        System.out.println(nums);//后面2个被移到前面
        Collections.rotate(nums,-1);//前面1个移动到后面
        System.out.println(nums);
    }
}
