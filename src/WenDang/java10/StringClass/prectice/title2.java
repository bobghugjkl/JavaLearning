package WenDang.java10.StringClass.prectice;
/*
将字符串“iu10i11cs10r10sdf10i10”中的数字摘取出来进行加法运算，注意：连续数字字符的要当成一个
数，比如“10”要当成一个整数 10。

 */
public class title2 {
    public static void main(String[] args) {
        String s = "iu10i11cs10r10sdf10i10";
        int sum = 0;
        String s1 = "0";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                s1 = s1 + c;
            }else{
                sum = sum + Integer.parseInt(s1);
                s1 = "0";
            }
        }
        sum = sum +Integer.parseInt(s1);
        System.out.println(sum);
    }
}
