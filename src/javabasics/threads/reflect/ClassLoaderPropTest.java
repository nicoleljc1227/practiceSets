package javabasics.threads.reflect;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * Created by xl on 2017/9/3.
 */
public class ClassLoaderPropTest {
    public static void main(String[] args) throws IOException {
        //��ȡϵͳ�������
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println("ϵͳ������� apploader��"+classLoader);//һ����classPath·��
        Enumeration<URL> eml = classLoader.getResources("");
        while (eml.hasMoreElements()){
            System.out.println(eml.nextElement());
        }
        //��ȡϵͳ��������ĸ�����������õ�ExtClassLoader
        ClassLoader extLoader = classLoader.getParent();
        System.out.println("��չ�������"+extLoader);
        System.out.println("��չ��������ļ���·��"+System.getProperty("java.ext.dirs"));
        System.out.println("��չ���������parent: "+extLoader.getParent());
    }
}
