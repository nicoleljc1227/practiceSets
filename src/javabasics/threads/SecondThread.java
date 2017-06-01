package javabasics.threads;

/**
 * Created by Administrator on 2017/6/1.
 */
public class SecondThread implements Runnable {

    private int j;
    //run方法是线程执行体
    @Override
    public void run() {
        for( ;j<100;j++){
//            要获取当前线程只能用currentThread.getName()
//
            System.out.println(Thread.currentThread().getName()+" "+j);

        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i==20){
                SecondThread st = new SecondThread();
//                通过new Thread(traget,name)创建新线程
                new Thread(st,"新线程1").start();//创建新线程
                new Thread(st,"新线程2").start();
//                两个线程的变量i是共有的，使用这种创建方式后，多个线程可以共享一个target
            }
        }
    }
}
