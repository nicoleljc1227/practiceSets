package zhenti2017.ali;

/**
 * Created by xl on 2017/8/27.
 */
public class Test {
    static class Emp {
        public int age;
    }

    public static int  change(Emp emp,int a)
    {
        a =20;
        emp.age = 50;
        emp.age = 60;
        emp = new Emp();//再创建一个对象
        emp.age=100;
        return a;
    }

    public static void main(String[] args) {
        int a = 10;
        Emp emp = new Emp();
        emp.age = 100;
        System.out.println(emp.age);
        System.out.println(a);
        int res = change(emp,a);
        System.out.println(emp.age);
        System.out.println(res);

        System.out.println(emp.age);
    }
}
