package WenDang.java11.DateFormatClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class prase {
    public static void main(String[] args)throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = "2020年6月27日";
        Date date = df.parse(str);
        System.out.println(date);
    }
}
