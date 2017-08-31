package zhenti2017.meituan;

import java.util.*;

/**
 * Created by xl on 2017/8/26.
 */
public class num1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] num = new int[N];
            for (int i = 0; i <N ; i++) {
                num[i] = sc.nextInt();
            }
            int K = sc.nextInt();
            int ASN = 0;


            List list = new ArrayList();

            boolean flag = false;
            for (int i = 0; i <N ; i++) {
                int count = 1;
                int temp = num[i];
                if(num[i]%K==0&&num[i]!=0){
                    flag=true;
                    list.add(count);
                }
                for (int j = i+1; j <N ; j++) {
                    count++;
                    temp+=num[j];

                    if(temp%K==0&&temp!=0){
                        flag = true;
                        list.add(count);
                    }
                }
            }

            Collections.sort(list);
            ASN = (int) list.get(list.size()-1);

            if(flag){
                System.out.println(ASN);
            }else {
                System.out.println(0);
            }

        }
    }
}

/**
 * K 的倍数
 时间限制：C/C++语言 2000MS；其他语言 4000MS
 内存限制：C/C++语言 65536KB；其他语言 589824KB
 题目描述：
 序列中任意个连续的元素组成的子序列称为该序列的子串。
 现在给你一个序列P和一个整数K，询问元素和是K的倍数的子串的最大长度。
 比如序列【1,2,3,4,5】，给定的整数K为 5，其中满足条件的子串为{5}、{2,3}、{1,2,3,4}、{1,2,3,4,5}，
 那么答案就为 5，因为最长的子串为{1,2,3,4,5}；如果满足条件的子串不存在，就输出 0。
 输入
 第一含一个整数N, 1 ≤ 𝑁 ≤ 105 。
 第二行包含 N 个整数𝑝𝑖 ，𝑝𝑖 表示序列P第i个元素的值。0 ≤ 𝑝𝑖 ≤ 105 。
 第三行包含一个整数 K， 1 ≤ 𝐾 ≤ 105  。
 输出
 输出一个整数ANS，表示答案。

 样例输入
 Input Sample 1
 5
 1 2 3 4 5
 5
 Input Sample 2
 6
 3 1 2 7 7 7
 4
 样例输出
 Output Sample 1
 5
 Output Sample 2
 5
 */
