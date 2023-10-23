package GUI.com.kuangshen.lesson1;

import java.awt.*;

//GUI的第一个界面
public class TestFrame {
    public static void main(String[] args) {

        //Frame,JDK看源码找构造方式，找Structrue
        Frame frame = new Frame("我的第一个java图形界面窗口");

        //设置窗口大小
        frame.setSize(400,400);
        //设置颜色,Color,ctrl+鼠标左键来搞源码的方法参数

        frame.setBackground(new Color(8, 132, 103));

        //弹出的初始位置
        frame.setLocation(200,200);
        //设置大小固定
        frame.setResizable(false);
        //设置可见性  w,h,直接点后可以看到所有方法
        frame.setVisible(true);
    }
}
