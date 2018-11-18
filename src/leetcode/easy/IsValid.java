package leetcode.easy;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2018/11/18.
 * 判断括号是否有效
 */
public class IsValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String input = sc.nextLine();
            System.out.println(isValid(input));
        }
    }

    public static boolean isValid(String input){
        if (input.equals("")||input.isEmpty()){
            return true;
        }
        char[] chars = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]=='['||chars[i]=='('||chars[i]=='{'){
                stack.push(chars[i]);
            }else if(chars[i]==')'&&!stack.empty()&&stack.peek()=='('){
                stack.pop();
            }else if(chars[i]==']'&&!stack.empty()&&stack.peek()=='['){
                stack.pop();
            }else if(chars[i]=='}'&&!stack.empty()&&stack.peek()=='{'){
                stack.pop();
            }else {
                return false;
            }
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
}
