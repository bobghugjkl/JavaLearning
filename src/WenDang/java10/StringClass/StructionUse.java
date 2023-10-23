package WenDang.java10.StringClass;

import java.io.UnsupportedEncodingException;

public class StructionUse {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //无参构造
        String str = new String();
        //有参构造
        String str1 = new String("abc");
        //通过字符数组构造
        char chars[]={'a','b','c'};
        String str2 = new String(chars);
        System.out.println(str2);
        //通过字节数组创造
        byte bytes[]={97,98,99};
        String str3 = new String(bytes);
        System.out.println(str3);//时拿到了整数对应的unicode字符
        //通过字节数组构造且当前代码编译环境为utf_8
        byte bytes1[]="你好".getBytes();
        String str4 = new String(bytes1,"gbk");
        String str5 = new String(bytes1,"utf-8");
        System.out.println(str4);
        System.out.println(str5);
    }
}
