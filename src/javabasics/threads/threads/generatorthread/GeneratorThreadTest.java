package javabasics.threads.threads.generatorthread;

/**
 * Created by xl on 2018/11/12.
 */
public class GeneratorThreadTest {
    public static void main(String[] args) {
        GeneratorThread generatorThread = new GeneratorThread();
        Thread a = new Thread(generatorThread);
        a.start();
        //a.run();//如果是调用run方法 当前进程还是main 说明是顺序执行
    }
}
