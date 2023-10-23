package JavaSE.IO.File;

import java.io.File;

/*
file遍历文件夹目录功能
 */
public class Demo6File {
    /*
    两方法便利的是构造方法中给出的目录
    如果构造方法中给出的目录不存在，会抛出空指针异常
    若给出的路径不是一个目录，也会给出空指针异常
     */
    public static void main(String[] args) {
        show01();
    }
    public static void show01(){
        //方法一
        File file = new File("C:\\Users\\DELL\\Desktop\\test");
        String[] list = file.list();//返回一个string数组，表示所有子文件或目录，可以获取隐藏文件和文件夹
        for (String s : list) {
            System.out.println(s);
        }
        //方法二
        File[] files = file.listFiles();//创建一个file数组，表示其所有子文件和目录
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
