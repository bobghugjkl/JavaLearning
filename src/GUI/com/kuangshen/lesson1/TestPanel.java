package GUI.com.kuangshen.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Penal 可以看成是一个空间，但是不可以单独存在，完事后出现的东西会在fanel窗口

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();//存在一个布局的感念

        //设置布局
        frame.setLayout(null);//有一个默认的管理器可以设置为null,不设置默认置顶
        //坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(121, 7, 236));
        //Panel设置坐标，相对的概念
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(7, 248, 7));
        frame.add(panel);//可以嵌入
        frame.setVisible(true);//设置可见性
        //监听事件：监听窗口关闭事件  System.exit(0)
        //适配器模式：
        frame.addWindowListener(new WindowAdapter() {
            @Override
            //是一个子类里面是他原来的参数
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });
    }
}
