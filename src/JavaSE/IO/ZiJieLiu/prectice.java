package JavaSE.IO.ZiJieLiu;
//369
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件复制：一读一写
先文件输入流读入地址下的文件，然后文件输出流将读取数据存入指定的内存地址中
FileInputStream fis = new FileInputStream("...");
FileOutputStream fos = new FileOutputStream("...");
读取：
int len =0;
while(len=fis.read()!=-1){
    写入
    fos.write(len);
}
 */
public class prectice {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\表情包\\素材\\20210820100629_9dc98.jpeg\"");
        FileOutputStream fos = new FileOutputStream("E:\\表情包\\成果\"");
//        int len =0;
//        while((len=fis.read())!=-1){
//            fos.write(len);
//        }
        //优化使用数组缓冲让它读取多个字节
        byte []bytes = new byte[1024];
        int len =0;//每次的有效距离
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //先关写的流后关闭读的流
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println(e-s);//可以看多少毫秒复制
    }
}
