package JavaSE.IO.ZiFuLiu;

import java.io.FileReader;
import java.io.IOException;

public class Demo01ZiFu {
    /*
    字节流读取中文文件会出现问题
    因为每个中文往往用不同的字节
    字符输入流：Reader(),是一个抽象类
    read()单个字符，当然也可以传入数组
    共性成员方法：
        int read()
        int read(char [])
        void close()
    因为是抽象类无法直接使用，故而我们只能用它的子类
    以reader或者writer结尾的我们叫它字符流，以output或者input结尾的叫字节流
    FileReader
        继承了Reader和InputsStream
        又叫文件字符输入流
        把硬盘中的文件中的数据以字节的方式读取到内存中
        构造方法：
        FileReader()
            一样可以写两种参数，一个是文件的路径，一个是一个文件
     字符输入流使用步骤：
        使用FileReader()对象构造方法中要绑定的数据源
        使用它的方法read文件
        释放资源
     */
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:\\服务外包\\WatchVideo\\src\\JavaSE\\IO\\ZiFuLiu\\c.txt");
//        int len=0;
//        while((len=fileReader.read())!=-1){
//            System.out.print((char)len);
//        }
//        fileReader.close();单个读取
        //缓冲读取多个字节
        char []cs = new char[1024];//存取读到的多个字符
        int len =0;//记录的是每次读取的有效字符个数
        while((len=fileReader.read(cs))!=-1){
            /*
            String的构造方法
            String(char[]value)把字符数组转为字符串
            String(char[]value ,int offset,int count)把字符数组的一部分转换为字符串，offset数组开始索引，count转换的个数
             */
            System.out.print(new String(cs,0,len));
        }
    }
}
