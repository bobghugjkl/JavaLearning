package JavaSE.ToString;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Java", 12, 21, Color.BLACK);
        Cat cat2 = new Cat("C++", 12, 21, Color.WHITE);
        Cat cat3 = new Cat("Java", 12, 21, Color.BLACK);
        System.out.println("猫咪1号：" + cat1);
        System.out.println("猫咪2号：" + cat2);
        System.out.println("猫咪3号：" + cat3);
    }
}
