package GUI.com.kuangshen.lesson5;

import GUI.com.kuangshen.lesson4.JFrameDemo;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo1 extends JFrame {
    public JButtonDemo1() {
        Container contentPane = this.getContentPane();
        //将第一个图片变成图标
        URL resource = JButtonDemo1.class.getResource("QQ图片20230226204126.jpg");
        Icon icon = new ImageIcon(resource);

        //把这个图标放在按钮上
        JButton jButton = new JButton();
        jButton.setIcon(icon);
        jButton.setToolTipText("图片按钮");

        //add
        contentPane.add(jButton);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo1();
    }
}
