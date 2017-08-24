package javabasics.threads;

/**
 * Created by xl on 2017/6/18.
 * https://www.tianmaying.com/tutorial/JavaThread
 * 对象锁
 */
public class TestSynchronized {
    public void test1() {
        synchronized (this) {//同步代码块
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName()+" "+i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized  void test2() {//同步方法

            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName()+" "+i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

        }
    }


    public static void main(String[] args) {
        final TestSynchronized myt2 = new TestSynchronized();
        Thread test1 = new Thread(new Runnable() {
            @Override
            public void run() {
                myt2.test1();
            }
        },"test1");

        Thread test2 = new Thread(new Runnable() {
            @Override
            public void run() {
                myt2.test2();
            }
        },"test2");

        test1.start();
        test2.start();


    }
}
