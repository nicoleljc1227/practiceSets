package collection;

import java.util.LinkedList;

/**
 * Created by xl on 2017/5/26.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        System.out.println("addfirst"+list);
        list.addFirst("addfirst");
        System.out.println("addLsat"+list);
        list.addLast("addLast");
        System.out.println();
        System.out.println(list.getFirst()+"getfirst");
        System.out.println(list.getLast()+"getlast");
        System.out.println(list.removeFirst()+"removeFirst");
        System.out.println(list.removeLast()+"removeLast");
        System.out.println();
        System.out.println(list);
    }
}
