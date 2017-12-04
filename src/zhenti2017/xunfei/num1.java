package zhenti2017.xunfei;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/16.
 * RL  相当于2个人面对面要删掉一个人 删掉任意一个人都可以
 * LRRLRL ->LRLRL->LRRL->LRL->LR
 *
 * 发现规律只要找到一串R开头最后以L结尾的都可以
 */
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i,j;
       for (i=0;i<str.length();i++){
           if(str.charAt(i)=='R'){
               break;
           }
       }

        for (j=str.length()-1;j>=0;j--){
            if(str.charAt(j)=='L'){
                break;
            }
        }
        if(i<j){
            System.out.println(i+str.length()-j);
        }else {
            System.out.println(str.length());
        }
    }
}
