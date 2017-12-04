package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xl on 2017/5/26.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(6);
        li.add(9);
        List list = li;
        List<String> ls = list;
        System.out.println(list.get(1));

    }
}
