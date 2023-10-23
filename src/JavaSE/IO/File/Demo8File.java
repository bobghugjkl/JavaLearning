package JavaSE.IO.File;

import java.io.File;

/*
文件过滤器优化demo7代码
File类中有两个和ListFiles重载的方法，参数传递就是过滤器，用来过滤文件，一个是FileFilter，一个是FileNmaeFilter
抽象方法：accept，测试制定抽象路径名是否应该包含在某个路径名列表中
参数：使用ListFiles方法遍历目录，得到的每一个文件对象
另一个accept两个参数，第一个是传递的被便利的目录，另一个是获取每一个文件夹的名称
没有实现类，需要我们自己写实现类确定规则
 */
public class Demo8File {
    public static void main(String[] args) {
        File file = new File("\"C:\\Users\\DELL\\Desktop\\文本文档.txt\"");
        getAllFile(file);
    }
    public static void getAllFile(File dir){
        System.out.println(dir);//打印目录
        File[]file =dir.listFiles(new FileFilterImpl());//传递过滤器
        /*
        listFiles方法作用
        1：对构造方法目录进行遍历，获取其中的每一个文件、文件夹，封装为File对象
        2.listFiles方法会调用参数传递的过滤器中的accept方法
        3.会把遍历得到的每一个File对象，传递过accept方法的参数pathname
        accept返回true就保存
        false就不保存
        我们可以设置accept规则改为是否以.java结尾
         */
        for (File file1 : file) {
            if(file1.isDirectory()){
                getAllFile(file1);
            }else {

                    System.out.println(file1);


            }
        }

    }
}
