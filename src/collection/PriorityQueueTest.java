package collection;

import java.util.PriorityQueue;

/**
 * Created by xl on 2017/6/7.
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        //下面一次向pq加入4个元素
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        System.out.println(pq);//并不是按照元素加入顺序排列
        //访问第一个元素，其实就是最小元素
        System.out.println(pq.poll());

    }
}
