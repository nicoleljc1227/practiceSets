package javabasics.AopMoni;

/**
 * Created by xl on 2017/9/7.
 * 用于统计程序执行时间
 */
public class TimeAdvice implements Advice {
    long startTime;
    long endTime;
    @Override
    public void before() {
        startTime = System.nanoTime();//开始时间
    }

    @Override
    public void after() {
        endTime = System.nanoTime();//结束时间
    }
}
