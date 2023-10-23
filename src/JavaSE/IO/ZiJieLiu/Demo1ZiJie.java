package JavaSE.IO.ZiJieLiu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
一切皆为字节
字节输出流OutputStream
是所有字节流的超类（父类）
定义了一些子类共性的成员方法
close（）关闭此输出流并释放与之有关的任何系统资源
flush（）刷新此输出流并强制任何缓冲区的输出字节被写出
write（byte【】b）将b.length字节从指定的字节数组写入此输入流（可写多个字节）
write（byte[]b,int off,int len)从指定的字节数组写入len字节，从偏移量off开始输出到此输出流（可写多个字节）
write(int b)指定的字节输出流（只能写单个字节）

里面的一个字类：
FileOutputStream:文件字节输出流，把内存中的数据写入文件中，可以使用两个构造方法
参数一个是string一个是file
string name目的地是一个文件的路径
File file 目的地是一个文件
构造方法的作用
    1.创建一个FileOutputstream对象
    2.会根据构造方法中传递的文件或者文件路径，创建一个空的文件
    3.会把FileOutputstream对象指向创建好的文件


字节输出流写入数据：
写入数据的原理：
    java程序=》JVM=》os=》os调用写数据的方法=》把数据写入文件中

字节输出流的使用步骤：
    1.创建一个FileOutputStream对象，并传入参数
    2.调用中的方法write将数据写入
    3.释放资源，提高效率

这样的话每一次启动都会覆盖掉原来的那个而不是继续写数据
    续写：使用两个参数（String name ,boolean append或者File file ,boolean append）函数是FileOutputStream(就是原来的构造函数)
        第一个都是写入数据的目的地
        第二个是追加写开关，true：不会覆盖原文件
                        false会创建一个新文件覆盖原文件

    换行：
        window：\r\n
        linux:/n
        mac:/r
 */
public class Demo1ZiJie {
    public static void main(String[] args) throws IOException {
        //创建一个FileOutputStream对象，并传入参数（目的地）
        FileOutputStream fos = new FileOutputStream("E:\\服务外包\\WatchVideo\\src\\JavaSE\\IO\\File\\a.txt",true);//当然也可以new File("...")
        //调用中的方法write将数据写入
        fos.write(97);
        //释放资源，提高效率，将十进制转换为二进制，硬盘中存储的都是字节，显示的也不是97，而是编码表中的

        for (int i = 0; i < 20; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        //若是要显示100
        fos.write(49);
        fos.write(48);
        fos.write(48);
        //一次写多个字节，若第一个字节是正数会查询ASCII码，若是负数则第一个字节和第二个字节会组成中文显示，查询GBK码表
        byte[]bytes ={-65,-66,-67,68,69};
        fos.write(bytes);//烤殃E
        fos.write(bytes,1,2);//写一部分
        /*
        写入字符串的方法
         */
        byte[] bytes1 = "你好".getBytes();//转换成字节数组
        System.out.println(Arrays.toString(bytes1));//arrays工具类
        fos.write(bytes1);


        fos.close();
        //都有异常，但是都是write报错的子类，所以只需要解决那个即可
    }

}
