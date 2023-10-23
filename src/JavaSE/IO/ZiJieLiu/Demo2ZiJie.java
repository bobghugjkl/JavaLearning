package JavaSE.IO.ZiJieLiu;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/*
字节输入流InputStream
read（）来传入，和输出中的write一样有三种情况
然后还有close()关闭

java.io.FileInputStream extends InputStream
FileInputStream:文件字节输入流
把硬盘中的数据读取到内存中使用

构造方法：FileInputStream
同样参数有两种情况
    String name:文件路径
    File file :文件

    作用：
        1.会创建一个FileInputStream对象
        2.会把FileInputStream对象指定构造方法中要读取的文件

读取数据的原理和输出流是一样的，包括步骤
 */
public class Demo2ZiJie {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("\\E:\\服务外包\\学习flutter\\a.txt");
        //读取文件中的一个字节返回，读取到文件最后面就返回-1
//        int len = fis.read();
//        System.out.println(len);
//        //当然也可以使用while循环，读取到-1时结束
//        int len1 =0;//记录读取到的字节
//        while((len1=fis.read())!=-1){//布尔表达式：先用read方法读取一个字节，然后赋值给len1，最后是一个整体判断
//            System.out.println((char)len1);
//        }
        //一次读取多个字节
        //每次读取两个字节,读取到最后时如果是单数就只替换第一个，然后继续输出改变了的第一个和没改变的第二个，然后由于结束了如果继续读取就会返回-1
        byte []bytes = new byte[2];
        int len =fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        //String构造方法：String(byte[] bytes):把字节数组转化为字符串     String(byte[] bytes,int offset（数组开始索引）,int length（转换的字节个数)把字节数组的一部分转换为字符串
        System.out.println(new String(bytes));
        fis.close();
        /*
        byte数组起缓冲作用，一般定义为1024或者它的整数倍
        同样可以用循环优化
         */
        int len1=0;//记录读取到的有效字节的个数
        while((len1 =fis.read(bytes))!=-1){

            System.out.println(new String(bytes,0,len1));//只转有效的，第二个构造法
        }

    }

}
