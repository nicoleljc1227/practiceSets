package javabasics.threads;

/**
 * Created by Administrator on 2017/6/1.
 */
public class FirstThread extends Thread{
    private int j;
    public void run(){
        for (; j <100 ; j++) {
//            ��ǰ�̼̳߳�Thread��ʱ��ֱ��ʹ��this���Ի�õ�ǰ�߳�
//            Thread��getName()���ص�ǰ�̵߳�����
//
            System.out.println(getName()+" "+j);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            //ʹ��Thread��currentThread��ȡ��ǰ�߳�
            System.out.println(currentThread().getName()+" "+i);
            if(i==20){
                //������������һ���߳�
                new FirstThread().start();
                //�ڶ���
                new FirstThread().start();
                //�������߳���main
            }

        }
    }


}
