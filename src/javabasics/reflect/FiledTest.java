package javabasics.reflect;

import java.lang.reflect.Field;

/**
 * Created by xl on 2017/9/7.
 * 访问成员变量值
 */
public class FiledTest {
    static class Person{
        private String name;
        private int age;
        public String toString(){
            return "Person[name:"+name+ ", age:"+age+"]";
        }

    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //
        Person p = new Person();
        //获取Person类对应的class类
        Class<Person> personClass = Person.class;
        //获取成员变量name


        //使用getDeclaredFiled()可以获取各种访问控制符的成员变量
        Field nameField = personClass.getDeclaredField("name");
        //设置通过反射调用该成员变量时取消访问权限检查
        nameField.setAccessible(true);
        //调用set()方法对p对象的name成员变量设置值
        nameField.set(p,"nicole");


        //获取person类名为age的成员变量
        Field ageField = personClass.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.setInt(p,30);
        System.out.println(p);
        /**
         * name和age都是private通常这个2个成员变量只能在Person类里访问，本程序通过反射修改了name和age的值
         * getField()只能获取public修饰的成员
         * getDeclaredField()可以获取所有四十方式的成员
         *
         */

    }
}
