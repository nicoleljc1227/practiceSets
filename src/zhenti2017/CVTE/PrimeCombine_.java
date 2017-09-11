package zhenti2017.CVTE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**第二种解法
 * Created by xl on 2017/9/11.
 * 输入一个正整数，如果存在三个质数的和等于该正整数就称这三个质数是一组符合条件的数[2,3,5][2,5,3]...
 *
 * sum = a+b+c  sum-subsum = c；
 */
public class PrimeCombine_ {

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

            int count=0,sum;
            if(list.size()<3){
                System.out.println(count);
            }else {
                for (int i = 0; i < list.size(); i++) {
                    int j = i+1;
                    int k = list.size()-1;
                    while (j<k){
                        sum = list.get(i)+list.get(j)+list.get(k);
                        if(sum==N){
                            count++;
                            j++;
                        }
                        if(sum<N){
                            j++;//因为是有序的所以，sum如果小于N中间指针右移，如果还是小接着右边移
                        }
                        if(sum>N){
                            k--;//如果变大了 右指针左移
                        }
                    }

                }
                System.out.println(count);
            }

        }
    }


}
