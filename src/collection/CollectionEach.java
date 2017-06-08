package collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by xl on 2017/6/2.
 * 使用Lambda表达式遍历元素
 */
public class CollectionEach {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("book1");
        books.add("book2");
        books.add("book3");
        books.add("book4");
        books.forEach(obj-> System.out.println("遍历："+obj));

    }
}
