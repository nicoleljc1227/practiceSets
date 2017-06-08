package collection;

import java.util.LinkedList;

/**
 * Created by xl on 2017/5/26.
 * LinkedList类是List接口的实现类，意味着他是一个List集合可以根据索引来随机访问集合中的元素，
 * 初次之外，LinkedList还实现了Deque接口，可以被当成双端队列来使用，因此既可以被当成栈来使用，也可以被当成队列使用
 */
public class LinkedListExample2 {
    public static void main(String[] args) {
       LinkedList books = new LinkedList();
       books.offer("aaa");//添加到队列尾部
       books.push("bbb");//加入到栈的顶部
       books.offerFirst("ccc");//添加到队列的头部
        for (int i = 0; i <books.size() ; i++) {
            System.out.println("遍历中："+books.get(i));
        }
        //访问并不删除栈顶元素
        System.out.println(books.peekFirst());
        //访问并不删除队列的最后一个元素
        System.out.println(books.peekLast());
        //将栈顶元素弹出栈
        System.out.println(books.pop());
        System.out.println(books);
        //访问并删除队列最后一个元素
        System.out.println(books.pollLast());
        System.out.println(books);

    }
}
