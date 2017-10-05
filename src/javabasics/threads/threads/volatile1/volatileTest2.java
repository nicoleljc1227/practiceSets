package javabasics.threads.threads.volatile1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xl on 2017/10/3.
 * 避免volatileTest中的操作原子性问题，使用Lock
 */
public class volatileTest2 {
    public /*volatile*/ int inc = 0;
    Lock lock = new ReentrantLock();

    public void increase(){
        lock.lock();
        try{
            inc++;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final volatileTest2 test = new volatileTest2();
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

