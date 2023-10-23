package JavaSE.IO.ZiFuLiu;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02ZiFu {
    /*
    字符输出流：Write，是抽象类，也是最顶级的父类
    同样是write（）方法可以与之前写入的方法相同外，还增加了一个写入字符串的方法
    还有close和flush也就是刷新方法，close前要先flush,flush刷新缓冲区但是流还存在，而close是直接关闭流
    我们是用它的子类：FileWriter extends OutputStreamWrite extends Writer
    FileWriter:文件字符输出流，把内存中的字符数据写入到文件中
    构造方法：
        一样两种参数，一个传目的地一个传文件
        作用：
            会创建一个FileWriter对象
            会根据构造方法中的路径创建一个文件
            会把对象指向创建好的文件
     步骤：
        1.构造对象
        2.使用其中的write方法把数据写入到内存缓冲区中（字符转换为字节的过程）
        3.使用刷新方法，把内存缓冲区的数据刷新到内存中
        4.释放资源
     */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\服务外包\\WatchVideo\\src\\JavaSE\\IO\\ZiFuLiu\\c.txt");
        fw.write(97);
        //用字符数组
        char [] cs = {'a','b','c','d','e'};
        fw.write(cs);
        //字符数组的一部分
        fw.write(cs,1,3);
        //字符串
        fw.write("abcdlll");
        //字符串的一部分
        fw.write("lalala",2,3);

        //字符流续写和换行，使用两个参数的构造方法
        for (int i = 0; i < 10; i++) {
            fw.write("hellow"+i+"\r\n");
        }
        fw.flush();
        fw.close();
    }
}
