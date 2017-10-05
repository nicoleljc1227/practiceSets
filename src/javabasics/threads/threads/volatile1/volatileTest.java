package javabasics.threads.threads.volatile1;

/**
 * Created by xl on 2017/10/3.
 * 不能保证对变量的操作是原子性
 */
public class volatileTest {
    public volatile int inc = 0;
    public void increase(){
        inc++;
    }

    public static void main(String[] args) {
        final volatileTest test = new volatileTest();
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
        }    }


}

