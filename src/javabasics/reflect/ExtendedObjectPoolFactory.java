package javabasics.reflect;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by xl on 2017/9/7.
 * 在对象池工厂中允许添加配置对象的成员变量的值，工厂会读取该对象配置的成员变量值，并利用对象对应的setter方法设置成员变量的值
 */
public class ExtendedObjectPoolFactory {
    //定义一个对象池，前面是对象名后面是实际对象
    private Map<String,Object> objectPool = new HashMap<>();


    private Properties config = new Properties();
    //从指定属性文件中初始化Properties对象
    public void init(String fileName){
        try{
            FileInputStream fis = new FileInputStream(fileName);
            System.out.println();
            config.load(fis);
        }catch (IOException e){
            System.out.println("读取"+fileName+ "异常");
        }
    }
    //定义一个对象创建的方法

    //该方法只要传入一个字符串类名，程序可以根据该类名生成java对象
    private Object createObject(String clazzName) throws InstantiationException, ClassNotFoundException, IllegalAccessException {
        //根据字符串类获取对应的class对象
        Class<?> clazz = Class.forName(clazzName);
        //使用clazz的对应的默认构造器创建实例
        return clazz.newInstance();
    }

    public void initPool() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
            for (String name:config.stringPropertyNames()){
                //每取出一个key value如果该key中不包含%，表明是根据value来创建一个对象
                if(!name.contains("%")){
                    objectPool.put(name,createObject(config.getProperty(name)));
                }
            }


    }

    //根据属性文件来调用指定的setter方法
    public void initProperty() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        for (String name: config.stringPropertyNames()){
            //每取出一对key value则如果key中包含%，即可认为该key用于控制调用对象的setter方法设置值
            //%前半部分为对象名字，后半控制setter方法名
            if(name.contains("%")){
                String[] objAndProp = name.split("%");
                //取出调用setter方法的参数值
                Object target = getObject(objAndProp[0]);
                //获取setter方法名：set+"首字母大写“+剩下部分
                String mtdName = "set"+objAndProp[1].substring(0,1).toUpperCase()+objAndProp[1].substring(1);
                //通过target的getClass 获取它的实现类
                Class<?> clazz = target.getClass();

                //获取希望调用的setter方法
                Method mtd = clazz.getMethod(mtdName,String.class);
                //通过Method的invoke方法执行setter方法
                //将config.getProperty的值作为调用setter方法的参数
                mtd.invoke(target,config.getProperty(name));


            }
        }
    }

    public Object getObject(String name){
        return objectPool.get(name);
    }

    public static void main(String[] args) throws Exception{
        ExtendedObjectPoolFactory extPoolF = new ExtendedObjectPoolFactory();
        extPoolF.init("H:\\javawork\\practiceSets\\src\\javabasics\\reflect\\extObj.txt");
        extPoolF.initPool();
        extPoolF.initProperty();
        System.out.println(extPoolF.getObject("a"));
    }


}
