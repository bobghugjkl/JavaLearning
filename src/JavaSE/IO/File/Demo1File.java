package JavaSE.IO.File;

import java.io.File;

/*
java把电脑中的文件和文件夹封装成了一个file类，可以对其进行操作
我们可以：
    创建一个文件夹/文件
    删除文件/文件夹
    获取文件/文件夹
    判断其是否存在
    对文件夹进行遍历
    获取文件的大小
File类是与系统无关的类
三个单词：
    file文件
    directory文件夹/目录
    path路径
 */
public class Demo1File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;//路径分隔符
        System.out.println(pathSeparator);
        //windoes是分号，linux是冒号
        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符
        //windoes是反斜杠，linux是正斜杠，我们不可以写死了，所以用+File.separator


    }
}
