package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by xl on 2017/6/7.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        String[] books = {
                "java","python","Spring"
        };
        List bookList = new ArrayList();
        for (int i = 0; i <books.length ; i++) {
            bookList.add(books[i]);
        }
        ListIterator lit = bookList.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("反向迭代");
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
    }
}
