package collection;

/**
 * Created by xl on 2017/5/25.
 */
public class Person implements Comparable<Person>{
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        if (age<o.age){
            return -1;
        }else if(age>o.age){
            return 1;
        }else {
            return 0;
        }

    }
}
