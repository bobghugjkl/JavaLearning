package JavaSE.IO.File;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
我们不设置新的类，我们设置新的匿名内部类\
三种方式
 */
public class Demo9File {
    public static void main(String[] args) {
        File file = new File("\"C:\\Users\\DELL\\Desktop\\文本文档.txt\"");
        getAllFile(file);
    }
    public static void getAllFile(File dir){

//        System.out.println(dir);//打印目录
//        File[]file =dir.listFiles(new FileFilter() {//设置了匿名内部类
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java");
//            }
//        });
        //FilenameFiles也一样
//        File[]file =dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
//            }
//        });

        //使用Lambda表达式优化匿名内部类（接口中只有一个抽象方法）
        File[]file = dir.listFiles((File d,String name)->{
            return new File(d,name).isDirectory()||name.toLowerCase().endsWith(".java");
        });
        for (File file1 : file) {
            if(file1.isDirectory()){
                getAllFile(file1);
            }else {

                    System.out.println(file1);


            }
        }

    }
}
