package collection;

import java.util.*;

/**
 * Created by xl on 2017/5/25.
 * 通过Iterator对象逐个获取元素的逻辑。
 */
public class IteratorExample {
    public static void main(String[] args) {
        //创建集合，添加元素
        Collection<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            nums.add(i);

        }
//        //获取days 的集合迭代器
//        Iterator<Integer> it = days.iterator();
//        while(it.hasNext()){
//            int k = it.next();//取出该元素
//            System.out.println(k);
//        }
        Collection<Date> days = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            Date date = new Date();
            days.add(date);

        }
        //获取days 的集合迭代器
        Iterator<Date> it = days.iterator();
        while(it.hasNext()){
            Date k = it.next();//取出该元素
            System.out.println(k);
        }

        List<String> lists = Arrays.asList("aaa","bbb","ccc");
        Iterator<String> iterator = lists.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();////集合元素的值传给了迭代变量，仅仅传递了对象引用。保存的仅仅是指向对象内存空间的地址
            next ="修改后的";
            System.out.println(next);
        }
        System.out.println(lists);
        System.out.println(nums);
        System.out.println(days);

    }
}
