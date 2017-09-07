package javabasics.AopMoni;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by xl on 2017/9/6.
 * 通过InvocationHandler我们来实现动态代理，以后当我们调用obj的相关方法之前，都会通过invoke方法进行代理，而不会直接调用obj方法。
 */
public class SimpleProxy implements InvocationHandler
{
    private Object obj;
    private Advice advice;
    //实现代理
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try{
            advice.before();
            result = method.invoke(obj,args);
            advice.after();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    //绑定代理对象
    public Object bind(Object obj,Advice advice){
        this.obj = obj;
        this.advice = advice;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }


}
