package javabasics.threads.threads.generatorthread;

/**
 * Created by xl on 2018/11/12.
 */
public class CurrentThreadExpTest {
    public static void main(String[] args) {
        CurrentThreadExp currentThreadExp = new CurrentThreadExp();
        Thread thread = new Thread(currentThreadExp);
        thread.setName("aaa");
        thread.start();
    }
}
