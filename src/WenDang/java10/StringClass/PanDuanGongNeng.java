package WenDang.java10.StringClass;

public class PanDuanGongNeng {
    public static void main(String[] args) {
        //创建字符串对象
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "HELLO";
        //boolean equals(Object obj):比较字符串的内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("=============");
        //equalsIgnoreCase(String str)比较字符串的内容是否相同，忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        //创建字符串对象
        String s = "hello";
        //并且仅当此字符串包含指定的char值序列时，返回true
        boolean contains = s.contains("he");
        System.out.println(contains);

        String str = "helloworld";
        //boolean endsWith(String suffix):测试此字符串是否以指定的后缀结束
        boolean endsWith = str.endsWith("world");
        System.out.println(endsWith);
        System.out.println("=============");
        //boolean startsWith(String prefix):测试此字符串是否以指定前缀开始
        boolean startsWith = str.startsWith("hello");
        System.out.println(startsWith);
    }
}
