package WenDang.java11.ShuZhiGeShiHua;

import java.text.DecimalFormat;

public class Demo {
    public static void main(String[] args)throws Exception {
        // \u00A4表示货币字符；#表示数字，0时不显示；0表示数字，0时显示
        String decimalPattern = "\u00A4#,##0.00";
        DecimalFormat df = new DecimalFormat(decimalPattern);
        //TO DO...
        System.out.println(df.format(4350.3D));
        System.out.println(df.format(002345));
        System.out.println(df.parse(df.format(4350.3D)));
    }
}
