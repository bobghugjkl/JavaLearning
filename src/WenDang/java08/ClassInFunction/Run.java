package WenDang.java08.ClassInFunction;

public class Run {
    public void run(){
        // 定义一个局部内部类，作用范围更小，在方法外根本无法访问

        class InnerText {
            public int num2 = 5;

            public void run() {
                System.out.println(num2);
            }
        }
        InnerText it = new InnerText();
        it.run();
    }
}
