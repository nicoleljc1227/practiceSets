package collection;

import java.util.Hashtable;

/**
 * Created by xl on 2017/6/12.
 */

class A{
    int count;
    public A(int count){
        this.count = count;
    }
    //根据count的值来判断链各个对象是否相等
    public boolean equals(Object obj){
        if(obj==this)
            return true;
        if(obj!=null&&obj.getClass()==A.class){//A类判断2个A对象相等的标准是count实例变量相等，只要2个A对象的count变量相等则
            A a = (A) obj;
            return this.count ==a.count;
        }
        return false;
    }
    //根据count来计算hashcode
    public int hashCode(){
        return this.count;
    }
}
class B{
    //重写equals方法，B对象与任何对象通过equals方法比较都返回true
    public boolean equals(Object obj){
        return false;
    }

}
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new A(60000),"讲义");
        ht.put(new A(87563),"实战");
        ht.put(new A(1232),new B());
        ht.put(new A(87563),"实战1");
        System.out.println(ht);
        //只要2个对象通过equals方法比较返回true
        //hashtable就认为他们是是相等的value
        //由于Hashtable中有一个B对象，它与人格对象同归equals返回比较都相等，下面输出true
        System.out.println(ht.containsValue("测试字符串"));//输出true
        //只要2个A对象的count相等，则通过equals方法返回true，且hashCode值相等，则hashTable认为他们是相同 dkey
        System.out.println(ht.containsValue(new A(87563)));//输出true

    }
}
