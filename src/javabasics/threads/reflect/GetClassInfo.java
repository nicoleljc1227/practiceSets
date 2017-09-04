package javabasics.threads.reflect;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by xl on 2017/9/4.
 * 如何用过该Class对象来获取对应的详细信息
 */
@Repeatable(Annos.class)//定义可重复注解
@interface Anno{}
@Retention(value = RetentionPolicy.RUNTIME)
@interface Annos{
    Anno[] value();
}

//使用4个注解修饰该类
@SuppressWarnings(value = "unchecked")
@Deprecated
//使用重复注解修饰该类
@Anno
@Anno
public class GetClassInfo {
    //定义一个私有构造器
    private GetClassInfo(){

    }

    //定义一个有参数的构造器
    public GetClassInfo(String name){
        System.out.println("执行有参数构造器");
    }

    //定义一个无参数的info方法
    public void info(){
        System.out.println("执行无参数info方法");
    }

    public void info(String str){
        System.out.println("执行有参数info方法"+"其str参数"+str);
    }
    //定义一个测试用的内部类
    class Inner{

    }

    public static void main(String[] args) throws Exception{
        //下面代码可以获取GetClassInfo对应的class
        Class<GetClassInfo> classInfoClass = GetClassInfo.class;
        //获取该Class对象的对应的全部构造器
        Constructor[] ctors = classInfoClass.getDeclaredConstructors();
        System.out.println("GetClassInfo下的所有public构造器如下");
        for (Constructor c: ctors){
            System.out.println(c);
        }
        //获取该类对象的全部public方法，包括从java.lang.Object中得到的方法
        Method[] methods = classInfoClass.getMethods();
        System.out.println("GetClassInfo下的所有public方法");
        for(Method method:methods){
            System.out.println(method);//main方法也会输出
        }
        //获取该class对象所对应类的指定方法
        System.out.println("GetClassInfo里一个带字符串参数的info方法为"+classInfoClass.getMethod("info",String.class));
        //获取该class对象内全部注解
        Annotation[] annotations = classInfoClass.getAnnotations();
        System.out.println("GetClassInfo下全部Annotation如下");
        for (Annotation an : annotations){
            System.out.println(an);
        }

        System.out.println("该class元素上@SuppressWarnings注解为："+ Arrays.toString(classInfoClass.getAnnotationsByType(SuppressWarnings.class)));
        System.out.println("该class元素上@Anno注解为"+Arrays.toString(classInfoClass.getAnnotationsByType(Anno.class)));
        //获取该class对象锁对应类的全部内部类
        Class<?>[] inners = classInfoClass.getDeclaredClasses();
        System.out.println("GetClassInfo的全部内部类如下");
        for (Class c: inners){
            System.out.println(c);
        }
        //使用classforName方法加载Inner内部类
        Class inClazz = Class.forName("GetClassInfo$Inner");
        //通过getDeclaringClass获取该类所在的外部类
        System.out.println("InClazz对应类的外部类为"+inClazz.getDeclaringClass());
        System.out.println("GetClassTest的包为 "+classInfoClass.getPackage());
        System.out.println("GetClassTest的父类为"+classInfoClass.getSuperclass());
    }
}
