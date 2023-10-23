package JavaSE.FanXing;

public class Text {
    public static void main(String[] args) {
      //创建GenericInterface01对象，测试含有泛型的主接口(第一种)
        GenericInterface01 gi1 = new GenericInterface01();
        gi1.method("字符串");
        //测试使用第二种
        Generichterface02<Integer> gi2 = new Generichterface02<>();
        gi2.method(10);

        Generichterface02<Double>gi3 = new Generichterface02<>();
        gi3.method(23.4);
    }

}
