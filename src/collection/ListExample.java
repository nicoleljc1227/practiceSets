package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xl on 2017/5/25.
 */
public class ListExample {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "NLTK";
        Book book2 = new Book();
        book2.name = "NLTK";
        List<Book> lists = new ArrayList<>();
        lists.add(book1);
        //lists.add(book2);
//        System.out.println(lists.size());
//        lists.remove(book2);// 如果Book类没有重写equals()方法 没有添加book2 竟然不会报错 lists.size()都是1
//        System.out.println(lists.size());

        //Book中重写equals方法
        System.out.println(lists.size());
        lists.remove(book2);
        //可见把book1对象从集合中删除了，这表明List集合判断两个对象相等只要通过equals()方法，同一个实例。
        System.out.println(lists.size());
    }
}
