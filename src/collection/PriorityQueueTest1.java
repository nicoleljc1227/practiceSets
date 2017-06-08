package collection;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by xl on 2017/6/7.
 */
public class PriorityQueueTest1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(5);
        pq.add(5);
        pq.add(2);
        pq.add(1);
        pq.add(10);
        pq.add(3);
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        System.out.println();
        //采用降序排列方式，越小的越排在队尾巴
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//
            }
        };
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(5,cmp);
        pq1.add(2);
        pq1.add(8);
        pq1.add(9);
        pq1.add(1);
        while (!pq1.isEmpty()){
            System.out.println(pq1.poll()+",");
        }



    }
}
