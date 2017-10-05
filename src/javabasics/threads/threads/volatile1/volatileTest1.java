package javabasics.threads.threads.volatile1;

/**
 * Created by xl on 2017/10/3.
 * 避免volatileTest中的操作原子性问题，使用synch
 */
public class volatileTest1 {
    public int inc = 0;//这里如果加了volatile会死循环
    public synchronized void increase(){
        inc++;
    }

    public static void main(String[] args) {
        final volatileTest1 test = new volatileTest1();
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

