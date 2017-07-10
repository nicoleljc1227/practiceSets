package shiti_guangchang;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * Created by xl on 2017/7/10.
 * 从尾到头打印链表
 */
class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
public class PrintLiinkList {
    public static void main(String[] args) {

    }
    public static List<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Stack<ListNode> stack = new Stack<ListNode>();
        while(listNode!=null)
        {
            stack.push(listNode);
            listNode = listNode.next;
        }
        ListNode temp;
        while(!stack.isEmpty())
        {
            temp = stack.pop();
            arrayList.add(temp.val);
        }
        return arrayList;

    }
}
