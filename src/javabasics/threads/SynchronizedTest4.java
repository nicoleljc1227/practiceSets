package javabasics.threads;

/**
 * Created by xl on 2017/8/24.
 * thread1和thread2并发执行时却保持了线程同步。这是因为run中调用了静态方法method，而静态方法是属于类的，所以syncThread1和syncThread2相当于用了同一把锁。
 */
public class SynchronizedTest4 implements Runnable{
    private static int count;

    public SynchronizedTest4 () {
        count = 0;
    }
    //修饰静态方法，则会对所有该类的对象进行加锁
    public /*synchronized*/ static void method(){//这里也可以在类上加锁 效果一样
        synchronized (SynchronizedTest4.class){
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    //Thread.sleep(100);这里不需要加sleep 效果是一样的
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void run() {
        method();
    }

    public static void main(String[] args) {
        SynchronizedTest4 thread1 = new SynchronizedTest4();
        SynchronizedTest4 thread2 = new SynchronizedTest4();//新建了2个对象
        Thread thr1 = new Thread(thread1,"syncThread1");
        Thread thr2 = new Thread(thread2,"syncThread2");

        thr1.start();
        thr2.start();
    }
}
