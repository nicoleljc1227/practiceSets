package zhenti;

import java.util.Scanner;

/**
 * Created by xl on 2017/7/28.
 * 将单链表中m至n之间的节点逆转
 */
public class DTDream_num2 {
    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int x,ListNode node){
            data = x;
            next = node;
        }
    }

    public static ListNode createList(int[] a){
        //尾插法建立单链表、
        ListNode head = new ListNode(-1,null);
        ListNode q;
        ListNode p;
        q=head;
        for (int i = 0; i <a.length ; i++) {
            p = new ListNode(a[i],null);
            q.next = p;
            q = p;
        }
        return head;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] a = {1,2,3,4,5,6};
            ListNode head = createList(a);
            head = resverseLinkNode(m,n,head);


        }
    }


    public static ListNode resverseLinkNode(int m,int n,ListNode head){
        ListNode p = null;//记住m的前一个节点
        ListNode q = null;//记住n的后一个节点
        ListNode pre = null;//记住n的后一个节点
        ListNode cur = null;//记住n的后一个节点

        ListNode first = head.next;
        for (int i = 1; i <=n; i++) {
                if(i==m-1) {
                    p = first;
                }
                if(i==m){
                    pre = first;
                    cur = pre.next;
                }
                if(i==n){
                    q = first.next;
                }
                first = first.next;
        }

        for (int i = m; i <n ; i++) {
           /* if(i==n){
                pre.next = q;
                cur.next = pre;
                p.next = cur;
            }else {*/
                pre.next = cur.next;
                cur.next = p.next;//不能换成cur.next = pre//p在这里相当于中间那段链表的头结点
                p.next = cur;
                cur = pre.next;
            //}
        }

        return head;

    }





}
