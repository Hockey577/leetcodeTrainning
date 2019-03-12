package collectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        /**
         * 遍历方式1
         */
        System.out.println("遍历方式1");
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + ",value:" + entry.getValue());
        }

        /**
         * 遍历方式2
         */
        System.out.println("遍历方式2");
        for (String s : map.keySet()) {
            System.out.println("Key：" + s);
        }
        for (Integer i : map.values()) {
            System.out.println("Values:" + i);
        }

        /**
         * 遍历方式3 使用Iterator
         */
        System.out.println("遍历方式3");
        Iterator<HashMap.Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            HashMap.Entry<String, Integer> entry = entries.next();
            System.out.println("Key:" + entry.getKey() + ",values:" + entry.getValue());
        }

    }
}
