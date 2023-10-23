package JavaSE.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Text {
    public static void main(String[] args) {
        /*
        java.util.Collection接口
        是所有单列集合的共性方法。任意的都可以使用这些方法
         */
        //创建集合对象，使用多态，既让接口指向他的实现类
        Collection<String>coll = new ArrayList<>();
        System.out.println(coll);//重写了tostring方法
        //public boolean add(E e):添加，返回是一个boolean
        boolean b1 = coll.add("zhangsan");
        System.out.println("b1:"+b1);
        System.out.println(coll);
        coll.add("Tom");
        coll.add("....");
        System.out.println(coll);
        //remove删除元素,一样返回bool
        boolean b2 =coll.remove("....");
        System.out.println(b2);
        //contains查看是否包含对象
        boolean b3 =coll.contains("Tom");
        System.out.println(b3);
        //isEmpty判断是否为空
        boolean b4 =coll.isEmpty();
        System.out.println(b4);
        //toArray()把集合中的元素存储至数组中
        Object[] arr =coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //clear()清空集合所有元素但不删除集合
        coll.clear();
        System.out.println(coll);
    }
}
