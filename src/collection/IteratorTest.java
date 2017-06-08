package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by xl on 2017/6/7.
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("book1");
        books.add("book2");
        books.add("book3");
        books.add("book4");

        Iterator iterator = books.iterator();
        while (iterator.hasNext()){
            String book = (String) iterator.next();
            if(book.equals("book3")){
                iterator.remove();
            }

            book ="测试";//对book变量赋值不会改变集合元素本身
        }
        System.out.println(books);
    }
}
