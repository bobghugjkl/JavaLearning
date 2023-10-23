package JavaSE.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator接口，迭代器
JavaSE.Iterator<E>iterator()返回此迭代器
使用方法：
使用集合中方法iterator()获取迭代器的实现对象使用Iterator接口接收多态
然后使用hasnext方法看有没有下一个元素
next取出下一个元素
 */
public class text {
    public static void main(String[] args) {
        Collection<String>coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("麦迪");
        coll.add("詹姆斯");
        //迭代器是有泛型的，迭代器的泛型跟着集合走，集合是什么迭代器就是什么
        //多态   接口                  实现类对象
        Iterator<String>iterator= coll.iterator();
        boolean b1 = iterator.hasNext();
        System.out.println(b1);
        String s =iterator.next();
        System.out.println(s);//没有元素拿出元素会抛出异常（自己打打看看）
        //可以用循环优化，但是因为不知道多少元素所以用while
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //用for
        for(Iterator<String>it = coll.iterator();it.hasNext();){
            String e =it.next();
            System.out.println(e);
        }
        for(String e:coll){
            System.out.println(e);
        }
    }
}
