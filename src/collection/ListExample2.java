package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by xl on 2017/5/25.
 * sort方法和replaceAll方法
 */
public class ListExample2 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add("book1111");
        books.add("book22");
        books.add("book3");
        books.add("book4444444");
        //使用目标类型为Comparator的lambda表达式对List集合排序
        books.sort(Comparator.comparingInt(o -> o.toString().length()));
        System.out.println(books);
        //用字符串长度来替换所有元素
        books.replaceAll(ele->ele.toString().length());
        System.out.println(books);
    }
}
