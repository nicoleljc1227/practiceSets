package huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 之前都是自己写排序和去重，，其实java里面的集合很好用
 * Created by xl on 2017/4/9.
 */
public class num_3_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Set<Integer> set = new HashSet<>();
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                set.add(sc.nextInt());
            }
            TreeSet<Integer> treeSet = new TreeSet<Integer>();
            treeSet.addAll(set);
            for (Integer e : treeSet){
                System.out.println(e);
            }
        }
    }
}
