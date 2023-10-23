package WenDang.java10.StringBuilderClass.prectice;
//有如下字符串“iu7i8csr83sdf9",将其中的数字摘取出来组成一个 int 的数值输出。
public class title2 {
    public static void main(String[] args) {
        String s= "iu7i8csr83sdf9";
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                buffer.append(c);
            }
        }
        System.out.println("得到的字符串是："+buffer);
        int result = Integer.parseInt(buffer.toString());
        System.out.println("得到的数字为："+result);
    }
}
