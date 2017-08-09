package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by xl on 2017/8/9.
 * TreeMap HashMap LinkedHashMap默认排序
 * TreeMap默认是按照值进行排序的
 */
public class ThreeMapSort {
    public static void main(String[] args) {
        Map<Character,Integer> tree = new HashMap<>();
        Map<Character,Integer> linked = new LinkedHashMap<>();
        Map<Character,Integer> hash = new HashMap<>();
        System.out.println("tree:"+buildMap(tree));
        System.out.println("linked:"+buildMap(linked));
        System.out.println("hash:"+buildMap(hash));
    }
    public static Map buildMap(Map map){
        map.put("a",1);
        map.put("f",4);
        map.put("b",2);
        map.put("a",2);
        map.put("e",5);
        map.put("c",6);
        return map;
    }

}
