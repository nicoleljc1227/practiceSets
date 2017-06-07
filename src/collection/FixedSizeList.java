package collection;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xl on 2017/6/7.
 */
public class FixedSizeList {
    public static void main(String[] args) {
        //Arrays.ArrayList是一个固定长度的List集合，程序只能遍历访问该集合里的元素，不可增加、删除该集合里的元素
        List fixedList = Arrays.asList("aaa","bbb");
        System.out.println(fixedList.getClass());
        //使用方法引用遍历集合元素
        fixedList.forEach(System.out::println);
        //试图添加和删除元素会引发异常
        fixedList.add("ccc");
        fixedList.remove("aaa");
    }
}
