package WenDang.java11.DateClass;

import java.util.Date;

public class Text {
    public static void main(String[] args) {
        //创建日期对象
        System.out.println(new Date());
        //创建日期对象，并将当前的毫秒值转成日期对象
        System.out.println(new Date(0L));
    }
}
