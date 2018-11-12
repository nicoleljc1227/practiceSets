package javabasics.threads.threads.generatorthread;

/**
 * Created by xl on 2018/11/12.
 */
public class CurrentThreadExp extends Thread{
    public CurrentThreadExp(){
        System.out.println("CurrentThread -- begin");
        System.out.println(Thread.currentThread().getName());
        System.out.println("this.getName()"+ this.getName());
        System.out.println("CurrentThread -- end");
    }


    public void run(){
        System.out.println("run -- begin");
        System.out.println(Thread.currentThread().getName());
        System.out.println("this.getName()"+ this.getName());
        System.out.println("run -- end");
    }
}
