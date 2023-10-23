package JavaSE.BaoZhuangClass;

public class ZhuangXiangChaiXiang {
    public static void main(String[] args) {
        /*基本类型转换成字符串
        1.基本类型数据的值=""
        2.static String toString()方法
        3.String中的静态方法 static String valueOf()
        反过来
        parseXX("...")
    */
        String s1 =100+"";
        System.out.println(s1+200);//100200


        String s2 =Integer.toString(100);
        System.out.println(s2+200);


        String s3 = String.valueOf(100);
        System.out.println(s3+200);
        //反过来
        int i = Integer.parseInt("100");
        System.out.println(i+200);
    }
}
