package WenDang.java11.DateFormatClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class format {
    public static void main(String[] args) {
        Date date = new Date();
        //创建日期格式化对象，在获取格式化对象是可以指定风格
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = df.format(date);
        System.out.println(str);
    }
}
