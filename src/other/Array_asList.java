package other;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xl on 2017/4/7.
 */
public class Array_asList {

    public static void main(String[] args) {
        String s[]= {"aa","bb","cc"};
        List<String> sList = Arrays.asList(s);
        //sList.add("dd");不能进行list集合操作
        for(String str : sList){
            System.out.println(str);
        }
        System.out.println("------------------------");
        int i[]= {11,22,33};
        List inList = Arrays.asList(i);//intList中就有一个Integer数组类型的对象，整个数组作为一个元素存进去的
       // inList.add(44);
        for (Object obj: inList){//就一个元素
            System.out.println(obj.toString());
        }
        System.out.println("------------------------");
        Integer ob[]= {11,22,33};
        List<Integer> objList = Arrays.asList(ob);
        //objList.add(44);//objList.add(0);//由于asList返回的list的实现类中无add方法，所以会报错
        for (int a: objList){
            System.out.println(a);

        }
        //Collections.addAll(new ArrayList<Integer>(5), ob);//或者新建一个空的list,把要转换的数组用Collections.addAll添加进去
       // ArrayList<Integer> copyArrays=new ArrayList<Integer>(Arrays.asList(ob));//这是得到一个新的list，可对其进行add,remove了
        //asList()返回的是arrays中私有的终极ArrayList类型，它有set,get，contains方法，但没有增加和删除元素的方法，所以大小固定,


    }
}
