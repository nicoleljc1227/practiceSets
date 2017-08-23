package algorithm.struct.LinkedLink;


import java.util.Stack;

/**
 * 注意公共节点不是指的是节点的执行相等 而是整个节点的指向也相等，2条链表的尾部是有一小段是公共的、
 * 思路： 从尾部开始比较最后一个相同的节点就是要找的，但是链表只能从头节点开始遍历，相当于最后到达的节点要先比较，使用栈
 * Created by xl on 2017/8/23.
 * http://www.cnblogs.com/edisonchou/p/4822675.html
 *
 * 如果使用暴力的话，从头开始遍历一条然后再遍历另一条的时候要注意除了比较data是否相等还要比较next的指向是否相同，否则数据域相同但是指向不同
 */
public class FirstCommonNode {
    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int x){
            data = x;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7};
        int[] arr2 = {4,5,6,6,7};
        ListNode head1 = createList(arr);
        ListNode head2 = createList(arr2);
       // ListNode common = firstCommomNode(head1,head2);
        ListNode common = firstCommomNode1(head1,head2);
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

    //链表长度分别为m和n 空间复杂度m+n  时间复杂度也是m+n
    public static ListNode firstCommomNode(ListNode root1, ListNode root2){
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        if(root1==null||root2==null){
            return null;
        }
        while (root1!=null){
            stack1.push(root1);
            root1 = root1.next;
        }

        while (root2!=null){
            stack2.push(root2);
            root2 = root2.next;
        }
        ListNode res=null;

        while (!stack1.isEmpty()&&!stack2.isEmpty()){
            if(stack1.peek().data!=stack2.peek().data){//这里peek取出来的是节点 也就是2条链表，链表是不能直接用==比较的
                break;

            }else {
                res = stack1.pop();
                stack2.pop();
            }
        }
        return res;
    }
    //不使用栈 外部空间 先得到2条链表的长度 得到长的比短的长几个节点，然后开始同时遍历找到第一个相同的节点
    public static ListNode firstCommomNode1(ListNode root1, ListNode root2){
        int len1 = getListLength(root1);
        int len2 = getListLength(root2);
        ListNode p = null;
        ListNode q = null;
        if(len1>len2){
            while ((len1-len2)>0){
                root1 = root1.next;
                len1--;
                p = root1;
            }
            q = root2;
        }else {
            while ((len2-len1)>0){
                root2 = root2.next;
                len2--;
                p = root2;
            }
            q = root1;
        }
        while (p!=null){
            if(p.data!=q.data){//2个节点是否相等不能直接用== 要比较data
                p = p.next;
                q = q.next;
            }else {
                break;
            }
        }
        return p;
    }
    /**
     *
     * @param head
     * @return 返回链表长度
     */
    public static  int getListLength(ListNode head){
        int length = 0;
        while (head!=null){
            length++;
            head = head.next;
        }
        return length;
    }
}
