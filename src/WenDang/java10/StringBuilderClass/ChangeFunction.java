package WenDang.java10.StringBuilderClass;

public class ChangeFunction {
    public static void main(String[] args) {
        StringBuilder sr = new StringBuilder("hello");
        // append(xxx xx) : 将 xx 参数的字符串表示形式追加到序列。所有对象都可以。
        sr.append(12.12);
        sr.append(34);
        sr.append("567");
        System.out.println(sr);
        System.out.println("=========");
        // delete(int start, int end) : 移除此序列的子字符串中的字符。
        sr.delete(5,10);
        System.out.println(sr);
        System.out.println("============");
        // deleteCharAt(int index) : 移除此序列指定位置上的 char。
        sr.deleteCharAt(5);
        System.out.println(sr);
        System.out.println("===========");
        // insert(int offset, xxx xx) : 将 xx 参数的字符串表示形式插入此序列中。
        sr.insert(0,"你好");
        sr.insert(0,100);
        System.out.println(sr);
        System.out.println("===========");
        // replace(int start, int end, String str) : 使用给定 String 中的字符替换此序列的子字符串中的
        //字符。
        sr.replace(0,3,"999");
        System.out.println(sr);
        System.out.println("=============");
        // reverse() : 将此字符序列用其反转形式取代。
        sr.reverse();
        System.out.println(sr);
        System.out.println("============");
        // setCharAt(int index, char ch) : 将给定索引处的字符设置为 ch。
        sr.setCharAt(0,'9');
        System.out.println(sr);
        // setLength(int newLength) : 设置字符序列的长度。大于之前长度用空格补，小于之前长度则只保留传入
        //的长度
        sr.setLength(5);
        System.out.println(sr);
    }
}
