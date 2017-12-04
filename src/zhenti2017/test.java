package zhenti2017;

import zhenti2017.ali.Test;

/**
 * Created by xl on 2017/9/17.
 */
public class test
{
    /*private static  int a;
    private int b;
    static {
        test.a = 3;
        System.out.println(a);
        test t = new test();
        t.f();
        t.b = 1000;
        System.out.println(t.b);

    }

    static {
        test.a = 5;
        System.out.println(a);
    }

    public void f(){
        System.out.println("hello");
    }
    public static void f1(){
        System.out.println();//静态方法不能调用非静态变量
    }*/

    private static int x;

    public static void main(String[] args) {
        String st1= "aba";
        String  st2 = "aba";
        System.out.println(st1==st2);

        String st3 = new String("aba");
        System.out.println();

    }
}
