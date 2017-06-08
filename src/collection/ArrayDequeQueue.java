package collection;

import java.util.ArrayDeque;

/**
 * Created by xl on 2017/6/7.
 * ArrayDeque当做队列使用
 */
public class ArrayDequeQueue {
    public static void main(String[] args) {
        ArrayDeque queue = new ArrayDeque();
        //依次将三个元素加入队列
        queue.offer("aaa");
        queue.offer("bbb");
        queue.offer("ccc");
        System.out.println(queue);
        queue.push("ddd");
        System.out.println(queue);
        //访问队列头部元素，但并不将其poll出队列
        System.out.println(queue.peek());
        System.out.println(queue);
        //poll出第一个元素
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
        //push


    }
}
