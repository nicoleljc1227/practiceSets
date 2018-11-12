package javabasics.threads.threads.generatorthread;

/**
 * Created by xl on 2018/11/12.
 */
public class GeneratorThread extends Thread{
    //构造方法打印，获取当前进程
    public GeneratorThread(){
        System.out.println("构造方法打印"+Thread.currentThread().getName());
    }

    public void run(){
        System.out.println("run方法打印"+Thread.currentThread().getName());
    }

}
