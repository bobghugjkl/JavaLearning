package JavaSE.IO.File;

import java.io.File;

public class Demo2File {
    public static void main(String[] args) {
        /*
        file类的构造方法
         */
        show01();
        show02("c:\\","Dell");
        show02("d:\\","Dell");
        show03();
    }
    /*
    第三个构造方法
    第一个参数：父类是file类型，可以使用file类的方法进行路径操作，在使用路径进行创建对象
     */
    private static void show03(){
        File parent = new File("c\\");
        File file = new File(parent,"hellow.java");
        System.out.println(file);
    }
    /*
    第二个构造方法
    两个参数：父路径，子路径
    好处：父路径和子路径可以单独书写，使用灵活，可以单独变化
     */
    private static void show02(String parent,String child){
        File file = new File(parent,child);
        System.out.println(file);
    }
    /*
    第一个构造方法
    File（String pathnome）
        通过将给定路径名字符串转换为抽象路径名来创建一个新File实例
        可以是存在的也可以是不存在的
     */
    private static void show01(){
        File f1 = new File("C:\\Users\\DELL\\Desktop\\test");
        System.out.println(f1);//重写tostring方法，打印路径
    }

}
