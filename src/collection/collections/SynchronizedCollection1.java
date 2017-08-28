package collection.collections;

import java.util.*;

/**
 * Created by xl on 2017/8/28.
 * synchronizedXXX List,Set,Map
 */
public class SynchronizedCollection1
{
    public static void main(String[] args) {
        Collection c = Collections.synchronizedCollection(new ArrayList());
        List list = Collections.synchronizedList(new ArrayList<>());
        Map score = new HashMap();
        score.put("1",90);
        Map unmodifiableMap = Collections.unmodifiableMap(score);
    }
}
