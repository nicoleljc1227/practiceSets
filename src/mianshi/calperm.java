package mianshi;

/**
 * Created by xl on 2017/10/8.
 *  递归方法产生全排列。
 * 方法的总体思想：
 * 1、固定第一个位置的字符，针对余下的字符串递归调用全排列方法。每一个字符都要有做第一个字符的机会，
 * 所以有多少个字符，就要进行多少次与第一个字符的交换
 * 2、递归调用的过程如1.中依次类推
 * 2、在递归调用结束后，需要将递归调用前交换过的字符恢复原样，即做了什么改变，就要对什么改变进行复原
 */
public class calperm {
    public static void perm(char[] s,int from,int to){
        if(to<1){
            return;
        }
        if(from==to){
            System.out.println(s);
        }else {
            for (int i = from; i <=to ; i++) {
                swap(s,i,from); //交换前缀，使其产生下一个前缀
                perm(s, from+1, to);
                swap(s,from,i); //将前缀换回，继续做上一个前缀的排列
            }
        }
    }

    public static void swap(char[] s,int i,int j){
        char temp = s[i];
        s[i]=s[j];
        s[j] = temp;
    }

    public static void main(String[] args){
        char[] s = {'a','b','c'};
        perm(s,0,2);
    }
}
