package algorithm.struct.LinkedLink;

import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/8/1.
 * 链表回文 ：
 * 1 可以将链表逆转
 * 2 从前往后和从后往前遍历
 * 3 反向遍历的时候遍历的同时还要逆转链表，或者遍历的时候压入栈
 */
public class ListPalindrome {

    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int x){
            data = x;
        }
    }

    public static ListNode createList(int[] a){
        //尾插法建立单链表、这里不要头结点 2个移动指针 一个头结点指针
        ListNode head = new ListNode(a[0]);
        ListNode q;
        ListNode p;
        q=head;
        for (int i = 1; i <a.length ; i++) {
            p = new ListNode(a[i]);
            q.next = p;
            q = p;
        }
        return head;

    }

    public static void main(String[] args) {
       //int[] arr = {421,305,13,425,222,609,100,131,579,579,131,100,609,222,425,13,305,421};
       int[] arr = {1,2,3,2,1};
       ListNode head = createList(arr);
        System.out.println(isPaindrimeStack(head));
    }

    /**
     * 边遍历边逆转链表
     * @param head
     * @return
     */
    public static boolean isPaindrome(ListNode head){
        //带头结点的逆转方式 头结点是不会被逆转的
        //自己开辟一个节点当头结点

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = head,pcur = pre.next;
        int i = 1;
        int sum = pre.data*i;

        while (pre.next!=null){
            //
            i++;
            sum+=pcur.data*i; //主要pre一直没变，也就是pcur是不断指向当前节点，
            pre.next = pcur.next;
            pcur.next = dummy.next;
            dummy.next = pcur;
            pcur = pre.next;

        }
        i = 1;
        while (dummy.next!=null){

            sum-= dummy.next.data*i;
            dummy = dummy.next;
            i++;
        }
        if(sum==0){
            return true;
        }else {
            return false;
        }

    }
    static ListNode p = null;

    public static boolean isPaindrimeStack(ListNode head){

        if(head==null){
            return true;
        }
        if(p==null){
            p = head;
        }
        if(isPaindrimeStack(head.next)){
            if(head.data==p.data){//递归到末尾，退栈时检查，一旦不等，返回false
                p = p.next;
                return true;
            }else {
                p = p.next;
                return false;
            }
        }else {
            return false;
        }

    }
}
