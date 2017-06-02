package collection;

/**
 * Created by xl on 2017/6/2.
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();//向上转型
        c.add("aaa");
        c.add(6);//虽然集合里面不能防止基本烈性的值，但是java支持自动创想
        System.out.println("c里面的个数"+c.size());
        c.remove(6);
        System.out.println("c里面的个数"+c.size());
        c.add("book1");

        Collection books = new HashSet();
        books.add("book1");
        books.add("book2");
        //用c集合减去books集合中的元素
        c.remove(books);
        System.out.println("c集合中元素"+c);
        //删除c中所有元素
        c.clear();
        System.out.println("c集合中元素"+c);
        books.retainAll(c);//控制books集合中只剩下c中也包含的元素

    }
}
