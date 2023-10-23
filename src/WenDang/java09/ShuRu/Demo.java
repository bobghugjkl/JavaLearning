package WenDang.java09.ShuRu;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //创建键盘录入数据对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        System.out.println("请输入一个整数：");
        int i=sc.nextInt();
        //输出数据
        System.out.println("i:"+i);
        while(sc.hasNext())//使用ctrl+z命令表示不再输入,即 sc.hasNext()返回 false
        {
            System.out.println(sc.next());
        }
        //关闭流
        sc.close();
    }



}
