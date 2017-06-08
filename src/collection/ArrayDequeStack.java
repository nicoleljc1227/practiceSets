package collection;

import java.util.ArrayDeque;

/**
 * Created by xl on 2017/6/7.
 * ArrayDeque当做栈使用
 */
public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        //依次“push"入栈
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);
        System.out.println(stack.peek());//访问第一个元素但是不pop
        System.out.println(stack);
        System.out.println(stack.pop());//第一个元素出
        System.out.println(stack);

    }
}
