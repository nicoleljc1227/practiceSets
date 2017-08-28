package collection.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by xl on 2017/8/27.
 * Collections工具类提供查找替换操作
 */
public class CollectionsTest2 {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);
        System.out.println(Collections.max(nums));//输出最大元素
        System.out.println(Collections.min(nums));//输出最小元素
        nums.add(0);
        Collections.replaceAll(nums,0,1);//将nums中的0 使用1来替代
        System.out.println(nums);
        //判断-5在几个钟出现的次数返回1
        System.out.println(Collections.frequency(nums,-5));
        Collections.sort(nums);//对nums集合进行排序
        System.out.println(nums);
        //只有排序后的list集合才可以用二分法查询 输出找到的位置
        System.out.println(Collections.binarySearch(nums,3));
    }
}
