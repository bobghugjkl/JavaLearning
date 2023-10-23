package WenDang.java11.CalendarClass;

import java.util.Calendar;
import java.util.Date;

public class Text {
    public static void main(String[] args)throws Exception {
        //使用默认时区和语言环境获得一个日历
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getClass());
        //get方法用于获得当前日立各字段值
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println("==============");
        //add方法给定的日历字段添加或减去指定的时间量时，超过该字段的最大范围时，会向上一个字段进位
        cal.add(Calendar.MONTH,12);//修改当前时间为12个月后
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println("===================");
        //roll方法与add方法相似，区别在于超过该字段的最大范围时，不会向上进一位
        cal.roll(Calendar.MONTH,12);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println("===============");
        //获取月份表示的最值
        System.out.println(cal.getActualMaximum(Calendar.MONTH));
        System.out.println(cal.getActualMinimum(Calendar.MONTH));
        System.out.println("==========================");
        //set方法可以自由设置当前日历的各字段
        cal.set(Calendar.YEAR,2022);
        System.out.println(cal.get(Calendar.YEAR));
        //Calendar与Date都是表示日期的工具类，它们之间可以相互转换。
        Calendar cal1 = Calendar.getInstance();
        Date date = cal1.getTime();
        System.out.println(date);
        Calendar cale = Calendar.getInstance();
        cale.setTime(date);
    }
}
