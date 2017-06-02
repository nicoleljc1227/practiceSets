package collection;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by xl on 2017/5/26.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        List<Book> lists = new ArrayList<>();
        List<Book> list1 = new ArrayList<>(3);
        Book book1 = new Book();
        book1.name ="aaa";
        lists.add(book1);//添加book2的时候为什么吧book1覆盖了 ？？？

        Book book2 = new Book();
        book1.name ="bbb";
        lists.add(book2);

        //三种遍历方式
        //迭代器遍历
//        for (Object value : lists) {
//            System.out.println(value.toString());
//        }
        //随机遍历，通过索引值遍历
        for (int i = 0; i < lists.size(); i++) {
            String value = lists.get(i).name;
            System.out.println(value);
        }
        //for循环遍历 输出的是bbb  和 null
        for(Book b:lists){
            String name = b.name;
            System.out.println(name);
        }

        //Stack<Book> stack = new Stack<>();
    }
}
