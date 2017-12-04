package collection;

import java.util.Set;
import java.util.TreeMap;

/**
 * Created by xl on 2017/6/12.
 */
class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(){
        super();
    }

    public Student(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        int num1 = this.getAge()-o.getAge();
        int num2 = num1==0?this.getName().compareTo(o.getName()) : num1;

        return num2;
    }
}
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Student,String> map = new TreeMap();
        Student s1 = new Student("张三",27);
        Student s2 = new Student("李四",29);
        Student s3 = new Student("王五",16);
        Student s4 = new Student("张",27);
        map.put(s1,"2001");
        map.put(s2,"2002");
        map.put(s3,"2003");
        map.put(s4,"2004");

        Set<Student> set = map.keySet();
        for (Student student:set){
            String value = map.get(student);
            System.out.println(student.getName()+"->"+student.getAge()+"=="+value);
        }
    }

}
