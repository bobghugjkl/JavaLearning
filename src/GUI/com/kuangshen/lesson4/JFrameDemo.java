package GUI.com.kuangshen.lesson4;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo extends JFrame{
    //一般窗口是初始化出来的，所以有个init()方法
    public void init(){
        //顶级窗口，应该放在容器里面，需要把它实例化
        JFrame frame= new JFrame("乃木坂46");
        frame.setVisible(true);
        frame.setBounds(100,100,200,200);
        //设置文字
        JLabel label = new JLabel("欢迎来到乃木坂46",SwingConstants.CENTER); //让文本居中


        frame.add(label);
        frame.setBackground(Color.green);
        Container contentPane = frame.getContentPane();//获得容器，这是不一样的地方，容器里面的颜色才是真正的颜色
        contentPane.setBackground(Color.magenta);
        //关闭事件
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        //建立一个窗口
        new JFrameDemo().init();
    }
}
