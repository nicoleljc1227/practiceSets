package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by xl on 2017/6/7.
 */
public class IteratorEach {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("book1");
        books.add("book2");
        books.add("book3");
        books.add("book4");

        Iterator iterator = books.iterator();

        iterator.forEachRemaining(obj-> System.out.println("遍历元素："+obj));
    }
}
