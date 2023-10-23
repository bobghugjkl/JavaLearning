package WenDang.java10.StringClass;

public class GongNengFunction {
    public static void main(String[] args) {
        //创建字符串对象
        String s = "helloworld";
        //获取字符串的长度
        System.out.println(s.length());
        System.out.println("============");
        //String concat(String str)：将指定字符串连接至末尾
        String s1 = "hellow";
        String s2 = s1.concat("world");
        System.out.println(s2);
        //char charAt(int index):获取指定索引处字符
        //索引如果不在合理范围内会报索引越界
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println("==============");
        //int indexOf(String str):获取str在字符串对象中第一次出现的索引，没有返回-1
        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("owo"));
        System.out.println("gg");
        System.out.println("===================");
        //int lastIndexOf(String str):返回指定子字符串最后一次出现在该字符串内的索引，没有返回-1
        System.out.println(s.lastIndexOf("l"));
        System.out.println("===================");
        //String substring(int start):从start开始截取字符串到字符串结尾
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println("===================");
        //String substring(int start,int end):从start到end截取字符串，包含start但不包含end
        System.out.println(s.substring(0,s.length()));
        System.out.println(s.substring(3,8));
    }
}
