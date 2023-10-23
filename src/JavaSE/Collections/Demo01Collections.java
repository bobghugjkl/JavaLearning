package JavaSE.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //方法一，添加多个元素
        Collections.addAll(list,"a","b","...");
        //方法二：打乱
        Collections.shuffle(list);
        System.out.println(list);
        //sort升序默认
        Collections.sort(list);
        //自定义排序1,(Comparable)String什么的需要重写compareTO方法
        ArrayList<Person>list1=new ArrayList<>();
        list1.add(new Person("张三",10));
        list1.add(new Person("李四",20));
        list1.add(new Person("王五",19));
        Collections.sort(list1);
        System.out.println(list1);
        //自定义排序2：Comparator
        Collections.sort(list1, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //return 0;//认为都一样
               // return o1.getAge()-o2.getAge();
                int result = o1.getAge()-o2.getAge();
                if(result==0){
                   result= o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }

        });
    }
}
