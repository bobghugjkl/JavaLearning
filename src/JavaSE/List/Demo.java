package JavaSE.List;

import java.util.LinkedList;

/*
LinkList继承List接口
底层链表结构
使用其特有方法时不可以使用多态
 */
public class Demo {
    public static void main(String[] args) {
        show01();

    }
    //三个添加的方法,以及其他方法
    private static void show01() {
        //创建对象
        LinkedList<String>linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        linked.push("aaa");
        linked.addFirst("www");
        linked.addLast("qqq");
        System.out.println(linked);
        //返回第一个元素，以及最后一个元素
        String first = linked.getFirst();
        String last = linked.getLast();
        //linked.clear();
        System.out.println(linked);
        System.out.println(first);
        System.out.println(last);
        boolean s = linked.isEmpty();
        System.out.println(s);
        String s1 = linked.removeFirst();
        linked.removeLast();
        linked.pop();



    }
}
