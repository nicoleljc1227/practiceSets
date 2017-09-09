package javabasics.reflect;

import java.lang.reflect.Constructor;

/**
 * Created by xl on 2017/9/7.
 * 使用指定的构造器来创建
 */
public class CreateJFrame {
    public static void main(String[] args) throws Exception{
        //获取JFrame对应的class对象
        Class<?> jframeClazz = Class.forName("javax.swing.JFrame");
        //获取JFrame中带一个字符串参数的构造器
        Constructor ctor = jframeClazz.getConstructor(String.class);
        //调用Constructor的newInstance()
        Object obj = ctor.newInstance("测试窗口");
        //
        System.out.println(obj);
        //StringBuilder
    }

}
