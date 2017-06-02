package collection;

import java.util.*;

/**
 * Created by xl on 2017/5/26.
 */
public class ListCompareTest {
    public static final int COUNT = 100000;
    private static LinkedList linkedList = new LinkedList();
    private static ArrayList arrayList = new ArrayList();
    private static Vector vector = new Vector();
    private static Stack stack = new Stack();

    public static void main(String[] args) {
        //插入
        insertByPosition(stack);
        insertByPosition(vector);
        insertByPosition(linkedList);
        insertByPosition(arrayList);

        //
        System.out.println();
        //随机读取
        readByPosition(stack);
        readByPosition(vector);
        readByPosition(linkedList);
        readByPosition(arrayList);

        //
        System.out.println();

        //删除
        deleteByPosition(stack);
        deleteByPosition(vector);
        deleteByPosition(linkedList);
        deleteByPosition(arrayList);

    }

    //从指定位置删除count个元素并统计时间
    public static void deleteByPosition(List list){
        long startTime = System.currentTimeMillis();
        //删除list第一个位置元素
        for (int i = 0; i < COUNT; i++) {
            list.remove(0);
        }

        long endTime = System.currentTimeMillis();
        long interval = endTime-startTime;
        System.out.println(getListName(list)+":删除第一个位置"+COUNT+"个元素，花费时间"+interval);

    }

    //根据position不断从list中读取元素，并统计时间
    public static void readByPosition(List list){
        long startTime = System.currentTimeMillis();
        //读取list元素
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        long endTime = System.currentTimeMillis();
        long interval = endTime-startTime;
        System.out.println(getListName(list)+":读取"+COUNT+"个元素到，花费时间"+interval);

    }

    //向list的指定位置插入count个元素，并统计时间
    private static void insertByPosition(List list){
        long startTime = System.currentTimeMillis();

        // 向 list的位置0插入count个数
        for (int i = 0; i < COUNT; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        long interval = endTime-startTime;
        System.out.println(getListName(list)+":insert"+COUNT+"个元素到第一个位置，花费时间"+interval);
    }

    //获取list的名称
    private static String getListName(List list){
        //instanceof 双目运算符 左边操作是对象右边是类 当左边的对象是右边的类创建的对象时 返回true
        if(list instanceof LinkedList){
            return "LinkedList";
        }else if(list instanceof ArrayList){
            return "ArrayList";
        }else if(list instanceof Stack){
            return "Stack";
        }else if(list instanceof Vector){
            return "Vector";
        }else {
            return "List";
        }
    }
}
