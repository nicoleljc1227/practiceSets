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
    //����count��ֵ���ж������������Ƿ����
    public boolean equals(Object obj){
        if(obj==this)
            return true;
        if(obj!=null&&obj.getClass()==A.class){//A���ж�2��A������ȵı�׼��countʵ��������ȣ�ֻҪ2��A�����count���������
            A a = (A) obj;
            return this.count ==a.count;
        }
        return false;
    }
    //����count������hashcode
    public int hashCode(){
        return this.count;
    }
}
class B{
    //��дequals������B�������κζ���ͨ��equals�����Ƚ϶�����true
    public boolean equals(Object obj){
        return false;
    }

}
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new A(60000),"����");
        ht.put(new A(87563),"ʵս");
        ht.put(new A(1232),new B());
        ht.put(new A(87563),"ʵս1");
        System.out.println(ht);
        //ֻҪ2������ͨ��equals�����ȽϷ���true
        //hashtable����Ϊ����������ȵ�value
        //����Hashtable����һ��B���������˸����ͬ��equals���رȽ϶���ȣ��������true
        System.out.println(ht.containsValue("�����ַ���"));//���true
        //ֻҪ2��A�����count��ȣ���ͨ��equals��������true����hashCodeֵ��ȣ���hashTable��Ϊ��������ͬ dkey
        System.out.println(ht.containsValue(new A(87563)));//���true

    }
}
