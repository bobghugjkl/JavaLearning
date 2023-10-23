package WenDang.java10.StringClass.prectice;
/*
随便输入一段数字字符串，把其中连续出现次数最多的字符找出来并统计出此连续出现的字符的次数,
如:23311133333333。

 */
public class title1 {
    public static void main(String[] args) {
        String str = "23311133333333";
        //用于接收出现次数最多的字符
        char ch = ' ';//初始化为空
        //计算字符出现的次数
        int count = 1;
        //存放最大值
        int max = 0;
        for (int i = 0; i < str.length()-1; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            //如果两个字符相同，就开始自增加运算
            if(ch1 == ch2)
            {
                count++;
            }
            else{
                //不满足条件的情况下，进行字符的转换与最大值的转换
                if(count>=max){
                    //max存放的是当前遍历的字符出现的次数
                    max = count;
                    //放的是当前遍历的字符
                    ch = ch1;
                }
                //为什么要重新赋值1？
                count = 1;
            }
        }
        if(count > max){
            max = count;
            ch = str.charAt(str.length()-1);
        }
        System.out.println("出现次数最多的是："+ch+"，出现了"+max+"次");
    }
}
