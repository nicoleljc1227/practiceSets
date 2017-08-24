package javabasics.threads;

import java.io.IOException;

/**
 * Created by xl on 2017/8/24.
 * 多个线程访问synchronized和非synchronized代码块
 * 不是说一个线程执行synchronized代码块时其它的线程受阻塞吗？为什么上面的例子中thread1和thread2同时在执行。
 * 这是因为synchronized只锁定对象，每个对象只有一个锁（lock）与之相关联 但是syncThread1和syncThread2分别被创建了是2个对象，所以有2把锁互不干涉，所以2个线程可以同时执行
 */

public class SynchronizedTest2 implements Runnable{
    private int count = 0;
    public SynchronizedTest2(){
        count=0;
    }

    public void countAdd(){
        synchronized (this){
            for (int i = 0; i <5 ; i++) {
                System.out.println(Thread.currentThread().getName()+":"+(count++));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //非synchronized代码块，未对count进行读写操作，所以可以不用synchronized
    public void printCount(){
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"count"+(count));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {

        SynchronizedTest2 sync = new SynchronizedTest2();
        Thread thread1 = new Thread(sync,"A");
        Thread thread2 = new Thread(sync,"B");
        thread1.start();
        thread2.start();

    }


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("A")){
            countAdd();
        }else if(threadName.equals("B")){
            printCount();
        }
    }
}
