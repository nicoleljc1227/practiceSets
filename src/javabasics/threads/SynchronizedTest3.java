package javabasics.threads;

/**
 * Created by xl on 2017/8/24.
 * SynchronizedTest2
 */

public class SynchronizedTest3 {

    static class Account{
        String name;
        float amount;
        public Account(String name,float amount){
            this.name = name;
            this.amount = amount;
        }

        //存
        public void depoit(float amt){
            amount += amt;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void withdraw(float amt){
            amount -= amt;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public float getBalance(){
            return amount;
        }

    }
    //账户操作类
    static class AcountOperator implements Runnable{
        private Account account;
        public AcountOperator(Account account){
            this.account = account;
        }

        @Override
        public void run() {
            synchronized (account){//给对象加锁
                account.depoit(500);
                account.withdraw(500);
                System.out.println(Thread.currentThread().getName()+":"+account.getBalance());
            }
        }
    }


    public static void main(String[] args) {

        //创建多个线程访问账户
        Account account = new Account("zhan", 10000.0f);
        AcountOperator acountOperator = new AcountOperator(account);
        final int THREAD_NUM = 5;
        Thread thread[] = new Thread[THREAD_NUM];//创建5个线程并开启
        for (int i = 0; i <THREAD_NUM ; i++) {
            thread[i] = new Thread(acountOperator,"Thread"+i);
            thread[i].start();
        }

    }


}
