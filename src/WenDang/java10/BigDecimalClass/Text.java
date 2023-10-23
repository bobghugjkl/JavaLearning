package WenDang.java10.BigDecimalClass;

import java.math.BigDecimal;

public class Text {
    public static void main(String[] args)throws Exception {
        BigDecimal b1 = new BigDecimal("0.05");
        BigDecimal b2 = new BigDecimal("0.01");
        System.out.println(b1.add(b2).floatValue());
        b1 = new BigDecimal("1.0");
        b2 = new BigDecimal("0.42");
        System.out.println(b1.subtract(b2).floatValue());
        b1 = new BigDecimal("4.015");
        b2 = new BigDecimal("100");
        System.out.println(b1.multiply(b2).floatValue());
        b1 = new BigDecimal("123.3");
        b2 = new BigDecimal("100");
        System.out.println(b1.divide(b2).floatValue());
    }
}
