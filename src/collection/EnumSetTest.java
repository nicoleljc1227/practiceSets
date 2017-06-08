package collection;

import java.util.EnumSet;

/**
 * Created by xl on 2017/6/7.
 */
public class EnumSetTest {
    enum Season{
        SPRING,SUNMER,FALL,WINTER
    }
    public static void main(String[] args) {
        //创建一个EnumSet，元素时所有枚举值
        EnumSet es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);
        //创建一个EnumSet空集合，其指定集合是严肃是Season类的枚举值
        EnumSet es2 = EnumSet.noneOf(Season.class);
        es2.add(Season.WINTER);
        es2.add(Season.SPRING);
        System.out.println(es2);
        //以指定枚举值创建EnumSet
        EnumSet es3 = EnumSet.of(Season.SUNMER,Season.WINTER);
        System.out.println(es3);
        EnumSet es4 = EnumSet.range(Season.SUNMER,Season.WINTER);
        System.out.println(es4);
    }
}
