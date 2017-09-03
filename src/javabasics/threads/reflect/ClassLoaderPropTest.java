package javabasics.threads.reflect;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * Created by xl on 2017/9/3.
 */
public class ClassLoaderPropTest {
    public static void main(String[] args) throws IOException {
        //获取系统类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器 apploader："+classLoader);//一般是classPath路径
        Enumeration<URL> eml = classLoader.getResources("");
        while (eml.hasMoreElements()){
            System.out.println(eml.nextElement());
        }
        //获取系统类加载器的父类加载器，得到ExtClassLoader
        ClassLoader extLoader = classLoader.getParent();
        System.out.println("扩展类加载器"+extLoader);
        System.out.println("扩展类加载器的加载路径"+System.getProperty("java.ext.dirs"));
        System.out.println("扩展类加载器的parent: "+extLoader.getParent());
    }
}
