package algorithm.struct.BinTree;

/**
 * Created by xl on 2017/8/5.
 * 1,2,3,4,5  n=2时输出 1,2,3,5
 * 注意，当head为空，以及倒数第n个就是第一个节点
 */
public class RemoveNthNodeEndList {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //
        ListNode pre = head;
        ListNode temp = head;
        if(head==null){
            return head;
        }

        for (int i = 0; i <n ; i++) {
            temp = temp.next;//temp最终指向的是第n个节点的下一个
        }
        //当要删除的是第一个节点
        if(temp==null){
            return head.next;
        }
        //当要删除的是第二个节点
        if(temp.next==null){
            head.next = head.next.next;
            return head;
        }

        //要删除的节点不是第一个和第二个 所以temp.next!=null
        while (temp.next!=null){
            pre = pre.next;
            temp = temp.next;
        }
        pre.next = pre.next.next;//pre指向的待删除节点的前一个
        return head;
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
        int[] arr = {1,2,3,4,5};
        ListNode head = createList(arr);
        ListNode res = removeNthFromEnd(head,2);
        System.out.println();


    }
}
