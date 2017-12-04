package zhenti2017.xiecheng;

import java.util.*;

/**
 * Created by xl on 2017/6/16.
 */
public class num1 {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num1 = sc.nextInt();
            int[] nums1 = new int[num1];


            for (int i = 0; i <num1 ; i++) {
                nums1[i] = sc.nextInt();
            }

            int num2 = sc.nextInt();
            int[] nums2 = new int[num2];
            for (int i = 0; i <num2 ; i++) {
                nums2[i] = sc.nextInt();
            }

           List<Integer> list = new ArrayList<>();
            for (int i = 0; i <num1 ; i++) {
                if(!list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
            }
            for (int i = 0; i <num2 ; i++) {
                if(!list.contains(nums2[i])){
                    list.add(nums2[i]);
                }
            }
            Collections.sort(list);

            int len = list.size();
            float sum = 0;

            if(len%2==0){
                sum = ((float)(list.get(len/2-1))+(float)(list.get(len/2)))/2;
                System.out.println(Math.floor(sum*10)/10);
            }else {
                System.out.println(list.get(len/2));
            }



        }
    }
}
