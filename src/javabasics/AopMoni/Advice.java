package javabasics.AopMoni;

/**
 * Created by xl on 2017/9/7.
 * 模拟spring中的Advice接口
 */
public interface Advice {
    public void before();
    public void after();
}
