package javabasics.threads;

/**
 * Created by xl on 2017/6/18.
 *synchronized同时修饰静态和非静态方法
 * https://www.tianmaying.com/tutorial/JavaThread
 */
public class TestSynchronized2 {
    public synchronized void test1() {
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

    public static synchronized  void test2() {//
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
        final TestSynchronized2 myt2 = new TestSynchronized2();
        Thread test1 = new Thread(new Runnable() {
            @Override
            public void run() {
                myt2.test1();
            }
        },"test1");

        Thread test2 = new Thread(new Runnable() {
            @Override
            public void run() {
                TestSynchronized2.test2();
                //myt2.test2();结果同上
                //test2()结果同上
            }
        },"test2");

        test1.start();
        test2.start();


    }
}
