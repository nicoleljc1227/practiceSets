package collection;

import java.util.LinkedHashMap;

/**
 * Created by xl on 2017/6/12.
 * HashSet,LinkedHashSet
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap scores = new LinkedHashMap();
        scores.put("语文",80);
        scores.put("数学",70);
        scores.put("英语",60);

        scores.forEach((key,vale)-> System.out.println(key+"-->"+vale));
    }
}
