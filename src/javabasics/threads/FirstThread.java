package javabasics.threads;

/**
 * Created by Administrator on 2017/6/1.
 */
public class FirstThread extends Thread{
    private int j;
    public void run(){
        for (; j <100 ; j++) {
//            当前线程继承Thread类时，直接使用this可以获得当前线程
//            Thread的getName()返回当前线程的名字
//
            System.out.println(getName()+" "+j);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            //使用Thread的currentThread获取当前线程
            System.out.println(currentThread().getName()+" "+i);
            if(i==20){
                //创建并启动第一个线程
                new FirstThread().start();
                //第二个
                new FirstThread().start();
                //第三个线程是main
            }

        }
    }


}
