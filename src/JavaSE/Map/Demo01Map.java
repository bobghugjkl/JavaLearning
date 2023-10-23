package JavaSE.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01Map {
    /*
    HashMap存储自定义类型键值
    key：String类型
        String类型重写hashcode方法和equals方法，可以保证key唯一
    Person是value的类型
        可以重复
    如果反过来，person类作为key也是一样的，hashcode方法和equals方法
     */
    public static void main(String[] args) {
        //正着
        show01();
        //反着
        show02();
    }
    private static void show02(){
        HashMap<Person,String>map = new HashMap<>();
        //添加元素
        map.put(new Person("张三",18),"北京");
        map.put(new Person("李四",19),"上海");
        map.put(new Person("王五",20),"广州");
        map.put(new Person("张三",18),"山东");
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"=>"+value);

        }

    }
    private static void show01(){
        HashMap<String,Person>map = new HashMap<>();
        //添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));//会把张三给替换掉（key重复），null也是一样的
        Set<String> strings = map.keySet();
        for(String s:strings){
            Person person = map.get(s);
            System.out.println(s+"=>"+person);

        }

    }

}
