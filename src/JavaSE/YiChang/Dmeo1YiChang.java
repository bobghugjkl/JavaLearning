package JavaSE.YiChang;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Dmeo1YiChang {

    /*
    try-catch:一般在工作中记录在日志中进行对照，catch可以有多个，括号里面是异常类型和变量名
    没有异常只会执行try中的
     */
    public static void main(String[] args) {
        try {
            readFile("c:\\.a.tx");
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            System.out.println("无论是否有异常都会执行");
        }
    }
    public static void readFile(String fileName)throws IOException{
        if(!fileName.equals("c:\\a.txt"))
        {
            throw new FileNotFoundException("传递文件路径不一致");
        }

        if (!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }
    }
}
