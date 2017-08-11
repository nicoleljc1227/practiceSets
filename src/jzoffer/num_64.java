package jzoffer;

import java.util.*;

/**
 * Created by xl on 2017/6/15.
 */
public class num_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int size = sc.nextInt();
            int[] num = {2,3,4,2,6,2,5,1};
            System.out.println(maxInWindows(num,size));

        }
    }

    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> lists = new ArrayList<>();
        if(size==0){
            return lists;
        }else {
            for (int i = 0; i <num.length-size+1 ; i++) {
                int max = 0;
                for (int j = i; j <i+size ; j++) {
                    if(num[j]>max){
                        max = num[j];
                    }
                }
                lists.add(max);
            }
            return lists;
        }

    }

}
