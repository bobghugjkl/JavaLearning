package JavaSE.IO.File;

import java.io.File;
import java.io.IOException;

/*
创建一个新的文件，文件夹
删除文件，文件夹
 */
public class Demo5File {
    public static void main(String[] args) throws IOException {
        show01();
    }
    public static void show01() throws IOException {
        //创建一个新的文件（文件不存在时），此方法只能创建文件，且路径必须存在(不要被名称迷惑了！！！要看类型！！！)
        File f1 = new File("C:\\Users\\DELL\\Desktop\\test\\1.txt");
        boolean newFile = f1.createNewFile();//声明抛出了io异常，必须处理他
        System.out.println("newFile:"+newFile);//绝对相对都可以
        //创建单级文件夹和多级文件夹，同样将路径在构造方法中给出
        File f2 = new File("C:\\Users\\DELL\\Desktop\\test\\aaa");
        boolean mkdir = f2.mkdir();//只能创建单级文件夹
        System.out.println("mkdir:"+mkdir);
        File f3 = new File("C:\\Users\\DELL\\Desktop\\test\\bbb\\ccc\\ddd\\eee");
        boolean mkdirs = f3.mkdirs();//可以创建多级文件夹和单级文件夹，同样的不可以看他的路径而要看他的方法，极易混淆！！！
        //不会抛出异常，但是路径不存在不会创建
        System.out.println("mkdirs:"+mkdirs);
        //删除路径中给出的文件和文件夹,直接从硬盘删除
        boolean delete1 = f1.delete();
        System.out.println(delete1);
        boolean delete2 = f2.delete();
        System.out.println(delete2);
        f3.delete();

    }
}
