package other;

/**
 * Created by Administrator on 2017/6/2.
 */
public class test1 {
    public static synchronized void main(String[] a){
        Thread t=new Thread(){
            public void run(){Sogou();}
        };
        t.run();
        System.out.print("Hello");
    }
    static synchronized void Sogou(){
        System.out.print("Sogou");
    }
}
