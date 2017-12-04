package collection;

import java.util.Comparator;//是在集合外部实现的排序 而Comparable是集合内容定义 排序
import java.util.TreeSet;

/**
 * Created by xl on 2017/5/25.
 * TreeSet自定义排序
 * comparable相当于内部比较器。comparator相当于外部比较器。
 */
public class  TreeSetExample {
//    static class Person{
//        int age;
//
//    }
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.age = 20;
//        Person p2 = new Person();
//        p2.age = 30;
//        Comparator<Person> comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                //从大到小
//                if(o1.age<o2.age){
//                    return 1;// o1小于o2 返回正数
//                }else if (o1.age>o2.age){
//                    return -1;
//                }else {
//                    return 0;
//                }
//
//            }
//        };
        Person p1 = new Person();
        p1.age = 20;
        Person p2 = new Person();
        p2.age = 30;



        Comparator<Person> comparator = (o1, o2) -> {//
            //从大到小
            if(o1.age<o2.age){
                return 1;// // 如果o1-o2 为正数 代表o1在后面
            }else if (o1.age>o2.age){
                return -1;// 如果o1-o2 为负数 代表o1在前
            }else {
                return 0;
            }

        };

        TreeSet<Person> set = new TreeSet<>(comparator);
        set.add(p1);
        set.add(p2);
        System.out.println(set);



    }
}
