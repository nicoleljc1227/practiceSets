package zhenti2017.card51;
import javabasics.threads.threads.SecondThread;

import java.util.Scanner;

/**
 * Created by xl on 2017/9/18.
 */
public class num2  implements Runnable{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int counter;


        for (int i = 0; i < 100; i++) {
            if(i==20){
               num2 th1 = new num2();
               num2 th2 = new num2();
               num2 th3 = new num2();



//
            }
        }
    }



    @Override
    public void run() {

        synchronized(this){

        }

    }
}
