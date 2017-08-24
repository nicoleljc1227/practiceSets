package javabasics.threads;

/**
 * Created by xl on 2017/6/18.
 * 类锁的修修饰方法和代马快
 * https://www.tianmaying.com/tutorial/JavaThread
 */
public class TestSynchronized1 {
    public void test1() {
        synchronized (TestSynchronized1.class) {//代码块
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

    public static synchronized  void test2() {//同步方法

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
        final TestSynchronized1 myt2 = new TestSynchronized1();
        Thread test1 = new Thread(new Runnable() {
            @Override
            public void run() {
                myt2.test1();
            }
        },"test1");

        Thread test2 = new Thread(new Runnable() {
            @Override
            public void run() {
                TestSynchronized1.test2();
                //myt2.test2();结果同上
                //test2()结果同上
            }
        },"test2");

        test1.start();
        test2.start();


    }
}
