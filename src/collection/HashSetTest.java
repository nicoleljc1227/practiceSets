package collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by xl on 2017/6/7.
 * 向hashSet中添加可变对象后，后面程序修改了该可变对象的的实例变量，则可能导致它与集合中的其他元素相同
 * （即equals方法返回true）
 */
public class HashSetTest {
    static class R{
        int count;
        public R(int count){
            this.count = count;

        }
        public String toString(){
            return "R[count:"+count+"]";
        }
        public boolean equals(Object obj){
            if(this==obj){
                return true;
            }
            if(obj!=null&& obj.getClass() == R.class){
                R r = (R) obj;
                return this.count == r.count;
            }
            return false;
        }
        public int hashCode(){
            return this.count;
        }
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new R(5));
        hashSet.add(new R(6));
        hashSet.add(new R(7));
        hashSet.add(new R(8));
        System.out.println(hashSet);//
        Iterator it = hashSet.iterator();
        //提取第一个元素
        R first = (R) it.next();
        //为第一个榆树的count实例变量赋值
        first.count=6;
        //再次输出
        System.out.println(hashSet);
        //删除元素为6的元素
        hashSet.remove(new R(6));
        System.out.println(hashSet);//只删除了一个6
        System.out.println("是都包含count为6的R对象？"+ hashSet.contains(new R(6)));
        System.out.println("是都包含count为8的R对象？"+ hashSet.contains(new R(8)));

    }

}
