package javabasics.threads.threads.volatile1;

/**
 * Created by xl on 2017/10/3.
 */
public class Main
{
    public static void main(String[] args) {
        PringString print = new PringString();
        new Thread(print).start();
        //print.printStringMethod();
        System.out.println("我要停止他 "+Thread.currentThread().getName());
        print.setContinuePrint(false);
        //由于main线程一直处理while循环，导致程序不能继续执行后面代码，解决办法是使用多线程
    }
}
