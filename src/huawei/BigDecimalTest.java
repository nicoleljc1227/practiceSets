package huawei;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by xl on 2017/6/19.
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        double num = 12345.6409;
        BigDecimal bg = new BigDecimal(num).setScale(2, RoundingMode.UP);//四舍五入,保留2位小数
        BigDecimal bg1 = new BigDecimal(num).setScale(2, RoundingMode.DOWN);//不四舍五入,保留2位小数
        System.out.println(bg);
        System.out.println(bg1);

    }
}
