package javabasics.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2017/6/1.
 */
public class ThirdThread {

    public static void main(String[] args) {
        ThirdThread tt = new ThirdThread();
//      使用lambda表达式创建Callable<Interger>对象
//      使用FeatureTask来包装Callable对象
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () ->{

            int i=0;
            for (; i < 100 ; i++) {
                System.out.println(Thread.currentThread().getName()+"循环变量id值"+i);
                
            }
//            call()方法可以有返回值
            return i;

        });

        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"循环变量id值"+i);
            if(i==20){
//                还是以callable方法来创建
                new Thread(task,"有返回值的线程").start();
            }
        }

        try{
//            获取线程返回值
            System.out.println("子线程的返回值"+task.get());//task.get方法将导致主线程阻塞

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
