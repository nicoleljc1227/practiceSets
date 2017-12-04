package zhenti2017.redBook;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by xl on 2017/9/28.
 */
public class num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // n种优惠券
        int p = scanner.nextInt(); // 商品总金额

        // 输入这n种优惠券面值和张数
        DisCount[] disCounts = new DisCount[n];
        for (int i = 0; i < n; i++) {
            disCounts[i] = new DisCount(scanner.nextInt(), scanner.nextInt());
        }

        // 按照金额大小从大到小排序
        Arrays.sort(disCounts, new Comparator<DisCount>() {
            @Override
            public int compare(DisCount o1, DisCount o2) {
                return o2.getAmount() - o1.getAmount();
            }
        });

        // 从大到小拿，直到不能继续拿，剩下的就是要补的最小差价
        int restMoney = p;
        int currentDiscount = 0;
        while (restMoney > 0 && currentDiscount < n) {
            if (restMoney >= disCounts[currentDiscount].getAmount() * disCounts[currentDiscount].getCount()) {// 大于这种券的总额
                restMoney -= disCounts[currentDiscount].getAmount() * disCounts[currentDiscount].getCount();
                currentDiscount++; // 此时当前的券种已经用完，需要加1
            } else {
                while (restMoney >= disCounts[currentDiscount].getAmount()) {
                    restMoney -= disCounts[currentDiscount].getAmount();
                    disCounts[currentDiscount].setCount(disCounts[currentDiscount].getCount() - 1);
                }
                currentDiscount++;
            }
        }
        System.out.println(restMoney);
    }

    static class DisCount {
        private int amount;
        private int count;

        public DisCount(int amount, int count) {
            this.amount = amount;
            this.count = count;
        }

        public int getAmount() {
            return amount;
        }



        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

}
