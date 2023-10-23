package JavaSE.Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
继承了hashmap集合
哈希表加链表
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map);//key不允许重复，是无序的集合
        LinkedHashMap<String,String>map1=new LinkedHashMap<>();
        map1.put("a","a");
        map1.put("c","c");
        map1.put("b","b");
        map1.put("a","d");
        System.out.println(map1);//key不允许重复,但有序
    }
}
