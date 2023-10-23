package JavaSE.IO.File;

import java.io.File;

/*
获取功能的方法
 */
public class Demo3File {
    public static void main(String[] args) {
        show01();
    }
    private static void show01(){
        File file = new File("C:\\Users\\DELL\\Desktop\\test");
        File absoluteFile = file.getAbsoluteFile();
        System.out.println("绝对路径是"+absoluteFile);

        String path = file.getPath();
        System.out.println("是什么路径类型就返回什么路径类型："+path);//这个方法就是tostring方法

        String name = file.getName();
        System.out.println("路径的结尾部分是："+name);//就是名字，绝对相对都可以

        long length = file.length();
        System.out.println(length);//文件大小，以字节为长度单位，没有是0

    }
}
