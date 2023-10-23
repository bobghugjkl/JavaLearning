package WenDang.java11.DateFormatClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//请使用日期时间相关的 API，计算出一个人已经出生了多少天。
public class prectice {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入出生日期 格式 YYYY-MM-dd");
        Scanner scanner = new Scanner(System.in);
// 获取出生日期,键盘输入
        String birthdayString = scanner.next();
// 将字符串日期,转成 Date 对象
// 创建 SimpleDateFormat 对象,写日期模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
// 调用方法 parse,字符串转成日期对象
        Date birthdayDate = sdf.parse(birthdayString);
// 获取今天的日期对象
        Date todayDate = new Date();
// 将两个日期转成毫秒值,Date 类的方法 getTime
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long secone = todaySecond - birthdaySecond;
        if (secone < 0) {
            System.out.println("还没出生呢");
        } else {
            System.out.println(secone / 1000 / 60 / 60 / 24);
        }
        scanner.close();
    }
}
