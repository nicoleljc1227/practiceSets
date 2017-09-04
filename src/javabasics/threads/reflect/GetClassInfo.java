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
 * ����ù���Class��������ȡ��Ӧ����ϸ��Ϣ
 */
@Repeatable(Annos.class)//������ظ�ע��
@interface Anno{}
@Retention(value = RetentionPolicy.RUNTIME)
@interface Annos{
    Anno[] value();
}

//ʹ��4��ע�����θ���
@SuppressWarnings(value = "unchecked")
@Deprecated
//ʹ���ظ�ע�����θ���
@Anno
@Anno
public class GetClassInfo {
    //����һ��˽�й�����
    private GetClassInfo(){

    }

    //����һ���в����Ĺ�����
    public GetClassInfo(String name){
        System.out.println("ִ���в���������");
    }

    //����һ���޲�����info����
    public void info(){
        System.out.println("ִ���޲���info����");
    }

    public void info(String str){
        System.out.println("ִ���в���info����"+"��str����"+str);
    }
    //����һ�������õ��ڲ���
    class Inner{

    }

    public static void main(String[] args) throws Exception{
        //���������Ի�ȡGetClassInfo��Ӧ��class
        Class<GetClassInfo> classInfoClass = GetClassInfo.class;
        //��ȡ��Class����Ķ�Ӧ��ȫ��������
        Constructor[] ctors = classInfoClass.getDeclaredConstructors();
        System.out.println("GetClassInfo�µ�����public����������");
        for (Constructor c: ctors){
            System.out.println(c);
        }
        //��ȡ��������ȫ��public������������java.lang.Object�еõ��ķ���
        Method[] methods = classInfoClass.getMethods();
        System.out.println("GetClassInfo�µ�����public����");
        for(Method method:methods){
            System.out.println(method);//main����Ҳ�����
        }
        //��ȡ��class��������Ӧ���ָ������
        System.out.println("GetClassInfo��һ�����ַ���������info����Ϊ"+classInfoClass.getMethod("info",String.class));
        //��ȡ��class������ȫ��ע��
        Annotation[] annotations = classInfoClass.getAnnotations();
        System.out.println("GetClassInfo��ȫ��Annotation����");
        for (Annotation an : annotations){
            System.out.println(an);
        }

        System.out.println("��classԪ����@SuppressWarningsע��Ϊ��"+ Arrays.toString(classInfoClass.getAnnotationsByType(SuppressWarnings.class)));
        System.out.println("��classԪ����@Annoע��Ϊ"+Arrays.toString(classInfoClass.getAnnotationsByType(Anno.class)));
        //��ȡ��class��������Ӧ���ȫ���ڲ���
        Class<?>[] inners = classInfoClass.getDeclaredClasses();
        System.out.println("GetClassInfo��ȫ���ڲ�������");
        for (Class c: inners){
            System.out.println(c);
        }
        //ʹ��classforName��������Inner�ڲ���
        Class inClazz = Class.forName("GetClassInfo$Inner");
        //ͨ��getDeclaringClass��ȡ�������ڵ��ⲿ��
        System.out.println("InClazz��Ӧ����ⲿ��Ϊ"+inClazz.getDeclaringClass());
        System.out.println("GetClassTest�İ�Ϊ "+classInfoClass.getPackage());
        System.out.println("GetClassTest�ĸ���Ϊ"+classInfoClass.getSuperclass());
    }
}
