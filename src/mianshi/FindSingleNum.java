package mianshi;

/**
 * Created by xl on 2017/10/15.
 * 一个 数组只有一个数出现一次，其他数都出现2次，找出这个数字,两两抑或就可以
 * 一个 数组只有一个数出现一次，其他数都出现3次，找出这个数字
 */
public class FindSingleNum {

    public static void main(String[] args) {
        int[] arr = {2,2,8,1,1,4,4,2,4,1};

        int res = add(6,7);
    }

    public static int find(int[] arr){
        //将所有数转为二进制做加法，然后mod3
        return -1;
    }

    /**
     * 位抑或，二进制位上相同为0，不同为1：目的是相加后不需要进位取出
     * & 再左移一位，将相加后需要进位的单独取出
     * 重复以上2个步骤直到其中一方全为0
     * @param x
     * @param y
     * @return
     */
    public static int add(int x,int y){
        if(y==0) return x;
        int sum,carry;
        sum = x^y;
        carry = (x&y)<<1;
        return add(sum,carry);
    }


}
