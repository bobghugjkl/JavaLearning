package JavaSE.FanXing;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo5Generic {
    /*
    泛型的通配符：
    ？：代表任意的数据类型
    使用方式：
    不能创建对象使用，只能作为方法参数使用
    高级使用：上限和下限
    上限：类型名称<? extends 类 >对象名称
        只能接收该类型及其子类
    下限：类型名称<? super 类 > 对象名称
        只能接收该类型及其父类
    类与类之间的继承关系：
    Integer =>number=>object
    String =>object(从右向左逐渐递减)
     */
    public static void main(String[] args) {
        ArrayList<Integer>list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        ArrayList<String>list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");
        printArray(list01);
    }
    /*
    定义一个方法，可以遍历所有类型的ArrayList集合，但我们不知道他是什么数据类型，可以使用泛型的通配号来接收数据类型,泛型没有继承概念，所以没有object类
     */
    public static void printArray(ArrayList<?>list){
        //迭代器
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            //it.next()取出的是object类型，因为可以接受任意的数据类型
            Object obj =iterator.next();
            System.out.println(obj);

        }

    }
}
