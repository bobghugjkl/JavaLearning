//package WenDang.java10.StringBuilderClass.prectice;
//
//import java.util.Random;
//
///*
//取得系统时间 long 类型的形式，将其转变成字符串。然后往该字符串中，每隔两个字符插入一个新的字符，
//插入 5 次，新的字符随机抽取一个，从“ABCD…WXYZ0123456789”中抽取。
// */
//public class title1 {
//    public void main(String[] args) {
//
//
//        String basic = "1234567890QWERTYUIOPLKJHGFDSAZXCVBNM";
//// 获取当前系统时间并将其转换为字符串
//        String time = String.valueOf(String.currentTimemills());
//// 根据字符串创建 StringBuilder 对象
//        StringBuilder builder = new StringBuilder(time);
//// 创建随机类对象
//        Random random = new Random();
//        int offset = 2;
//        for (int i = 0; i < 5; i++) {
//// 将字符串 basic 的长度作为参数传递给 nextInt 方法，保证在该范围内取字符
//            int index = random.nextInt(basic.length());
//            char c = basic.charAt(index);
//            builder.insert(offset, c);
//            offset = offset + 3;
//        }
//        retrun builder.toString();
//    }
//
//}
