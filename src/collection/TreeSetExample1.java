package collection;

import java.util.TreeSet;

/**
 * Created by xl on 2017/5/25.
 * TreeSet添加一个可变的对象后，并且后面修改了该可变对象的实例变量，这导致它与其他对象的大小顺序发生改变炼丹师TreeSet不会再次调整他们
 */
public class TreeSetExample1 {

    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        Person p1 = new Person();
        p1.setAge(10);
        Person p2 = new Person();
        p2.setAge(20);
        Person p3 = new Person();
        p3.setAge(30);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println("初始顺序");
        for(Person p : set){
            System.out.println(p.getAge());
        }

        //修改年龄p1改为50 修改了person实例值的时候 TreeSet不会再管排序了
        p1.setAge(50);
        System.out.println("修改p1后集合排序");
        for(Person p : set){
            System.out.println(p.getAge());
        }

        p2.setAge(2);
        System.out.println("修改p2后集合排序");
        for(Person p : set){
            System.out.println(p.getAge());

        }

    }
}
