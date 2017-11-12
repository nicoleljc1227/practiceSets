package mianshi;

import java.util.Stack;

/**
 * Created by xl on 2017/10/8.
 * 用两个栈实现队列 - Java
 */
public class StackToQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int ele){
        stack1.push(ele);
    }

    public int  pop(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    public static void main(String[] args) {


    }
}
