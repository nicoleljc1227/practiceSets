package javabasics.AopMoni;

/**
 * Created by xl on 2017/9/7.
 * 客户端调用代码
 */
public class Client {
    public static void main(String[] args) {
        SimpleProxy sp = new SimpleProxy();
        //
        SalaryInterface salaryInterface = (SalaryInterface) sp.bind(new Salary(),new TimeAdvice());
        salaryInterface.doSalary();

    }
}

//如果我们要新增权限控制，我们实现ControlAdvice类
//public class ControlAdvice implements Advice{
    //public void before(){
        //if(...)
        //}
    //public void after(){
        //}
//}
//而我们客户端的代码只需要改成simpleProxy.bind(new Salary(), new ControlAdvie)就行了，而SimpleProxy本身不需要做任何的修改。
