package WenDang.java10.StringBuilderClass;

public class GouZaoFunction {
    public static void main(String[] args) {
        //StringBuilder()：构造一个不带任何字符的字符串生成器，其初始容量为16个字符
        StringBuilder builder = new StringBuilder();
        System.out.println(builder);
        System.out.println("=================");
        //StringBuilder(String str):与上面的一样，只不过初始化为指定的字符串内容
        StringBuilder builder2 = new StringBuilder("helloworld");
        System.out.println(builder2);
    }
}
