package collection;

import java.util.TreeSet;

/**
 * Created by xl on 2017/6/7.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(10);
        treeSet.add(-9);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        //返回小于4的子集
        System.out.println(treeSet.headSet(4));
        //返回大于5的子集,如果set中包含5，子集中还包含5
        System.out.println(treeSet.tailSet(5));
        //返回大于-3，小于4的子集
        System.out.println(treeSet.subSet(-9,5));//大于等于，小于


    }
}
