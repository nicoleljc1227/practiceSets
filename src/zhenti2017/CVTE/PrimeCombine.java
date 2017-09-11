package zhenti2017.CVTE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xl on 2017/9/11.
 * 输入一个正整数，如果存在三个质数的和等于该正整数就称这三个质数是一组符合条件的数[2,3,5][2,5,3]...
 *
 * sum = a+b+c  sum-subsum = c；
 */
public class PrimeCombine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int N = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            list.add(2);
            for (int i = 3; i <N ; i=i+2) {
                boolean ret = true;
                for (int j = 2; j <Math.sqrt(i)+1 ; j++) {
                    if(i%j==0){
                        ret = false;
                        break;
                    }
                }
                if(ret){
                    list.add(i);
                }
            }

            /*for (Integer it:list){
                System.out.println(it);

            }*/
            int mid=0;
            for (int i = 0; i <list.size() ; i++) {
                if(N/2<=list.get(i)){
                    mid = i-1;
                    break;
                }
            }
            int count=0;
            int Sum =0;
            if(mid<2){
                mid=2;
            }
            boolean flag = true;
            for (int i = mid; i <list.size() ; i++) {
                for (int j = i-1; j >=0 ; j--) {//第二重循环该可以设置flag1 如果最大的j和最大的k与i的和都小于N那么可以直接跳出
                    for (int k = j-1; k >=0 ; k--) {
                        Sum = list.get(i)+list.get(j)+list.get(k);
                        if(Sum==N){
                            count++;
                        }
                        if(Sum<N){
                            flag=true;
                            break;
                        }
                        if(Sum>N){//如果循环内所有得到的sum都大于N则没必要再移动i了 只会越来越大
                            flag=false;
                        }
                    }

                }
                if(!flag){//flag标记 i 和最小的就，的j，k 2个数值的和都比N大则 跳出
                    break;
                }
            }
            System.out.println(count*6);

        }
    }
}
