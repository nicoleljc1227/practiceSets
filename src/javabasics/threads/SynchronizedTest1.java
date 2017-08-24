package javabasics.threads;

import java.io.IOException;

/**
 * Created by xl on 2017/8/24.
 * 控制多线程执行顺序
 */

public class SynchronizedTest1{
    public static void main(String[] args) throws IOException{

        final Test test = new Test();
        new Thread(){
            public void run(){
                test.m1();
            }
        }.start();

        new Thread(){
            public void run(){
                test.m2();
            }
        }.start();

        new Thread(){
            public void run(){
                test.m3();
            }
        }.start();


    }

    static class Test{
        static int count;
        volatile int target = 1;
        synchronized void m1(){
            for (int i = 0; i <10 ; i++) {
                while (target==2||target==3){
                    try{
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("m1 "+i);
                target = 2;
                notifyAll();
            }


        }
        synchronized void m2(){
            for (int i = 0; i <10 ; i++) {
                while (target==1||target==3){
                    try{
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("m2 "+i);
                target = 3;
                notifyAll();
            }
        }

        synchronized void m3(){
            for (int i = 0; i <10 ; i++) {
                while (target==2||target==1){
                    try{
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("m2 "+i);
                target = 1;
                notifyAll();
            }


        }

    }



}
