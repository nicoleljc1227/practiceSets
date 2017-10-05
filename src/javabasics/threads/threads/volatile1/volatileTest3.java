package javabasics.threads.threads.volatile1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xl on 2017/10/3.
 * 避免volatileTest中的操作原子性问题，使用AutomicInteger
 */
public class volatileTest3 {
    public AtomicInteger inc = new AtomicInteger();

    public void increase(){
        inc.getAndIncrement();
    }

    public static void main(String[] args) {
        final volatileTest3 test = new volatileTest3();
        for (int i = 0; i <10 ; i++) {//10个线程
            new Thread(){
                public void run(){
                    for (int j = 0; j <100 ; j++) {
                        test.increase();
                    }
                }
            }.start();
        }

        while (Thread.activeCount()>1){
            Thread.yield();
            System.out.println(test.inc);
        }
    }


}

